package cur;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.apache.commons.lang3.StringUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainWithLimit {
    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/filename.csv");

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;

        // instantiating and populating columns.
        List<String> columns = new ArrayList<>();
        int i = 0;
        while ((nextRecord = csvReader.readNext()) != null && i < 1) {
            Collections.addAll(columns, nextRecord);
            i++;
        }
        // 14th column is the product type
        //print all products
        HashSet<String> allProducts = new HashSet<>();

        csvReader = new CSVReader(filereader);

        Map<String, Map<String, Set<String>>> productToEachAttributeToValues = new HashMap<>();

        csvReader.readNext();
        // populate {product -> (Attribute,Allvalues))}
        while ((nextRecord = csvReader.readNext()) != null) {
            productToEachAttributeToValues.put(nextRecord[14], new HashMap<>());
            if (productToEachAttributeToValues.get(nextRecord[14]).size() == 0) {
                for (String column : columns) {
                    productToEachAttributeToValues.get(nextRecord[14]).put(column, new HashSet<>());
                }
            }
        }

//        System.out.println(productToEachAttributeToValues.keySet());

        FileReader filereader1 = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/filename.csv");
        CSVReader csvReader1 = new CSVReader(filereader1);
        csvReader1.readNext();
        while ((nextRecord = csvReader1.readNext()) != null) {
            for (int k = 0; k < nextRecord.length &&
                    (productToEachAttributeToValues.get(nextRecord[14]).containsKey(columns.get(k)) && productToEachAttributeToValues.get(nextRecord[14]).get(columns.get(k)).size() < 15); k++) {
                if (productToEachAttributeToValues.get(nextRecord[14]).containsKey(columns.get(k))) {
                    productToEachAttributeToValues.get(nextRecord[14]).get(columns.get(k)).add(nextRecord[k]);
                }
            }
        }
        writeToCSV("AmazonElastiCache", productToEachAttributeToValues.get("AmazonElastiCache"));
        //writeToFile("AmazonEC2", String.valueOf(productToEachAttributeToValues.get("AmazonEC2")));
    }

    static void writeToFile(String fileName, String text) {
        System.out.println("hi");
        try {
            Files.write(Paths.get("/Users/nithinsingamsetti/Desktop/" + fileName + "_15Tags.txt"), text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void writeToCSV(String fileName, Map<String, Set<String>> map) {
        System.out.println("hi");
        try {
            final CSVWriter writer = new CSVWriter(
                    new FileWriter("/Users/nithinsingamsetti/Desktop/" + fileName + "_15Tags.csv"));
            //Create record

            List<String> sortedKeys = new ArrayList(map.keySet());
            Collections.sort(sortedKeys);

            for (String key : sortedKeys) {
                String[] record = new String[2];
                record[0] = key;
                record[1] = StringUtils.join(map.get(key), ";");
                writer.writeNext(record, false);
                writer.flush();
            }
            //close the writer
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
