import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ProofThatLineItemRepeatsWithDiffValues {
    public static void main(String[] args) {
        String inputFilePath = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/prod_cost_service_report-00003.csv";
        String outputFilePath = "/Users/nithinsingamsetti/Desktop/subset_cur.csv";
        int linesToExtract = 5000;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            int lineCount = 0;
            Set<String> lineItemIds = new HashSet<>();

            while ((line = reader.readLine()) != null && lineCount < linesToExtract) {
                if (line.split(",")[0].equals("n5agb5rpxbgygybulfg3iskpnno3e4wvtzd5p4efgkt2wuq4dloa")) {
                    System.out.println(line);
                }
                lineCount++;
            }

            System.out.println("First " + lineCount + " lines extracted and saved to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
