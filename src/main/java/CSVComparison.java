import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVComparison {

    public static void main(String[] args) throws IOException {
        String file1Path = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/result_1.csv";
        String file2Path = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/result_2.csv";
        String outputPath = "output.csv";

        List<CSVRecord> records1 = readCSV(file1Path);
        List<CSVRecord> records2 = readCSV(file2Path);
        List<CSVRecord> comparedRecords = compareCSV(records1, records2);
        writeCSV(comparedRecords, outputPath);

        System.out.println("Comparison and generation completed. Output saved to " + outputPath);
    }

    private static List<CSVRecord> readCSV(String filePath) throws IOException {
        return CSVParser.parse(new FileReader(filePath), CSVFormat.DEFAULT).getRecords();
    }

    private static List<CSVRecord> compareCSV(List<CSVRecord> records1, List<CSVRecord> records2) {
        List<CSVRecord> comparedRecords = new ArrayList<>();
        Map<String, String> firstMap = new HashMap<>();
        for (CSVRecord record1 : records1) {
            firstMap.put(record1.get(0), record1.get(1));
        }

        Map<String, String> secondMap = new HashMap<>();
        for (CSVRecord record2 : records2) {
            secondMap.put(record2.get(0), record2.get(1));
        }

        for (String key : firstMap.keySet()) {
            System.out.println(key + "\t" + firstMap.get(key) + "\t" + secondMap.get(key));
        }

        return comparedRecords;
    }

    private static void writeCSV(List<CSVRecord> records, String outputPath) throws IOException {
        CSVPrinter printer = new CSVPrinter(new FileWriter(outputPath), CSVFormat.DEFAULT);
        for (CSVRecord record : records) {
            printer.printRecord(record);
        }
        printer.close();
    }
}
