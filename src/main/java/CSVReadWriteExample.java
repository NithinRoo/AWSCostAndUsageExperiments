import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVReadWriteExample {
    public static void main(String[] args) throws IOException {
        // Define the CSV file paths
        String inputFile = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/ppp.csv";
        String outputFile = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/ppp2.csv";

        // Read CSV file
        CSVParser csvParser = new CSVParser(new FileReader(inputFile), CSVFormat.DEFAULT);
        List<CSVRecord> records = csvParser.getRecords();
        csvParser.close();

        // Write to CSV file
        FileWriter fileWriter = new FileWriter(outputFile);
        CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);

        // Write header row (if needed)
        csvPrinter.printRecord(records.get(0));

        int i = 1;
        int j = 1;
        while (j < records.size()) {
            CSVRecord record = records.get(i);
            if (records.get(j).get(0).isEmpty()) {
                csvPrinter.printRecord(record.get(0), record.get(1), record.get(2), records.get(j).get(3)
                        , records.get(j).get(4), records.get(j).get(5), records.get(j).get(6));
            } else {
                i = j;
                csvPrinter.printRecord(records.get(i));
            }
            j++;
        }
        csvPrinter.close();
        fileWriter.close();
    }
}
