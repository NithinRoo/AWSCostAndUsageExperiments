package cur;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/filename.csv");

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;

        // instantiating and populating columns.
        List<String> columns = new ArrayList<>();
        List<String> importantColumns = new ArrayList<>();
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
                    if (!column.contains("date")) {
                        productToEachAttributeToValues.get(nextRecord[14]).put(column, new HashSet<>());
                    }
                }
            }
        }

//        System.out.println(productToEachAttributeToValues.keySet());

        FileReader filereader1 = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/filename.csv");
        CSVReader csvReader1 = new CSVReader(filereader1);
        csvReader1.readNext();
        while ((nextRecord = csvReader1.readNext()) != null) {
            for (int k = 0; k < nextRecord.length; k++) {
                if (productToEachAttributeToValues.get(nextRecord[14]).containsKey(columns.get(k))) {
                    productToEachAttributeToValues.get(nextRecord[14]).get(columns.get(k)).add(nextRecord[k]);
                }
            }
        }
        writeToFile("AmazonECS", String.valueOf(productToEachAttributeToValues.get("AmazonECS")));
    }

    static void writeToFile(String fileName, String text) {
        System.out.println("hi");
        try {
            Files.write(Paths.get("/Users/nithinsingamsetti/Desktop/" + fileName + ".txt"), text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToCSVFile(String fileName, String text) {
        try {
            Path path = Paths.get("/Users/nithinsingamsetti/Desktop/" + fileName + ".csv");
            if (!Files.exists(path))
                Files.createFile(path);
            Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
