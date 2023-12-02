import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CSVSubsetExtractor {
    public static void main(String[] args) {
        String inputFilePath = "/Users/nithinsingamsetti/Desktop/aar/aar1.csv";
        String outputFilePath = "/Users/nithinsingamsetti/Desktop/aar/aar2_es1.csv";
        int linesToExtract = 1000;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            CSVReader csvReader = new CSVReader(reader);
            String[] nextRecord = csvReader.readNext();
            String[] headers = nextRecord;
            System.out.println(Arrays.toString(headers));
            writer.write(Arrays.toString(headers));

            String line;
            int lineCount = 0;
            while ((nextRecord = csvReader.readNext()) != null && lineCount < linesToExtract) {
                if (nextRecord[13].equals("AmazonElastiCache")) {
                    System.out.println(Arrays.toString(nextRecord));
                    writer.write(Arrays.toString(nextRecord));
                    writer.newLine();
                    lineCount++;
                }
            }

            System.out.println("First " + lineCount + " lines extracted and saved to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}