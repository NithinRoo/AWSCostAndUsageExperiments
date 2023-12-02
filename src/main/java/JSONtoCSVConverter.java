import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONtoCSVConverter {
    public static void main(String[] args) {
        // Specify the input JSON file path
        String inputFilePath = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_hits.json";

        // Specify the output CSV file path
        String outputFilePath = "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_hits3.csv";

        // Call the JSON to CSV conversion method
        try {
            convertJSONtoCSV(inputFilePath, outputFilePath);
            System.out.println("Conversion completed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during conversion: " + e.getMessage());
        }
    }

    private static void convertJSONtoCSV(String inputFilePath, String outputFilePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File(inputFilePath));

        JsonNode firstObject = rootNode.elements().next();
        List<String> fieldNames = extractFieldNames(firstObject);

        try (FileWriter csvWriter = new FileWriter(outputFilePath)) {
            // Write the header row
            csvWriter.append(String.join(",", fieldNames));
            csvWriter.append("\n");

            // Write the data rows
            for (JsonNode node : rootNode) {
                String[] rowData = extractRowData(node, fieldNames);
                csvWriter.append(String.join(",", rowData));
                csvWriter.append("\n");
            }

            csvWriter.flush();
        }
    }

    private static List<String> extractFieldNames(JsonNode jsonObject) {
        List<String> fieldNames = new ArrayList<>();
        Iterator<String> fieldIterator = jsonObject.fieldNames();

        while (fieldIterator.hasNext()) {
            fieldNames.add(fieldIterator.next());
        }

        return fieldNames;
    }

    private static String[] extractRowData(JsonNode jsonObject, List<String> fieldNames) {
        String[] rowData = new String[fieldNames.size()];

        for (int i = 0; i < fieldNames.size(); i++) {
            String fieldName = fieldNames.get(i);
            JsonNode fieldValue = jsonObject.get(fieldName);

            if (fieldValue != null) {
                rowData[i] = fieldValue.asText();
            } else {
                rowData[i] = "";
            }
        }

        return rowData;
    }
}
