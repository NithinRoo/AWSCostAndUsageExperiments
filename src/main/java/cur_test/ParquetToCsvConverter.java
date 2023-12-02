package cur_test;

import org.apache.avro.generic.GenericRecord;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.avro.AvroParquetReader;
import org.apache.parquet.hadoop.ParquetFileReader;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.hadoop.metadata.ParquetMetadata;
import org.apache.parquet.schema.MessageType;
import org.apache.parquet.schema.Type;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParquetToCsvConverter {

    public static void main(String[] args) throws IOException {
        String parquetFilePath = "/Users/nithinsingamsetti/Desktop/ttr/";
        String csvFilePath = "/Users/nithinsingamsetti/Desktop/ttr/";

        Files.list(Paths.get(parquetFilePath)).filter(file -> file.getFileName().toString().contains("parquet"))
                .forEach(file -> {
                    System.out.println(file.getFileName());
                    writeToCSV(parquetFilePath + file.getFileName().toString(),
                            csvFilePath + file.getFileName().toString().split("\\.")[0]
                                    + ".csv");
                });
    }

    static void writeToCSV(String parquetFilePath, String csvFilePath) {
        try {
            ParquetMetadata parquetMetadata = ParquetFileReader.readFooter(new Configuration(), new Path(parquetFilePath));
            MessageType schema = parquetMetadata.getFileMetaData().getSchema();

            // Create a CSVWriter to write the records to CSV file
            CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFilePath));

            // Write the header row with field names
            String[] headerRow = schema.getFields().stream()
                    .map(Type::getName)
                    .toArray(String[]::new);
            csvWriter.writeNext(headerRow);

            // Use ParquetReader to read the data records
            ParquetReader<GenericRecord> reader = AvroParquetReader
                    .<GenericRecord>builder(new Path(parquetFilePath))
                    .withConf(new Configuration())
                    .build();

            GenericRecord record;
            while ((record = reader.read()) != null) {
                GenericRecord finalRecord = record;
                String[] csvRow = schema.getFields().stream()
                        .map(field -> finalRecord.get(field.getName()).toString())
                        .toArray(String[]::new);
                csvWriter.writeNext(csvRow);
            }

            reader.close();
            csvWriter.close();

            System.out.println("CSV file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
