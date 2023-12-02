package cur;


import java.io.*;

public class CSVSplitter {
    public static void main(String[] args) {
        String csvFilePath = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/prod_cost_service_report-00003.csv";
        String outputDirectory = "/Users/nithinsingamsetti/Desktop/splitFiles";
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String headerLine = reader.readLine();
            String[] headers = headerLine.split(",");

            // Create the output directory if it doesn't exist
            File directory = new File(outputDirectory);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            BufferedWriter[] writers = new BufferedWriter[500];
            for (int i = 0; i < headers.length; i++) {
                String columnName = headers[i].trim().replaceAll("/", "_");
                String outputFilePath = outputDirectory + "/" + columnName + ".csv";
                File file = new File(outputFilePath);
                file.createNewFile();  // Create the file if it doesn't exist
                writers[i] = new BufferedWriter(new FileWriter(file));
                writers[i].write(columnName);
                writers[i].newLine();
            }
            for (int i = headers.length; i < 500; i++) {
                String outputFilePath = outputDirectory + "/" + "random_" + i + ".csv";
                File file = new File(outputFilePath);
                file.createNewFile();  // Create the file if it doesn't exist
                writers[i] = new BufferedWriter(new FileWriter(file));
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < values.length; i++) {
                    writers[i].write(values[i]);
                    writers[i].newLine();
                }
            }

            for (BufferedWriter writer : writers) {
                writer.close();
            }

            System.out.println("CSV file split successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}