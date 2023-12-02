import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExtractTaggedProductsAndAppDRNs {
    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/29_jun_cur.csv");

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();

        //279 applicationDRN; 282 with splits
        System.out.println(nextRecord[282]);
        //productCode
        System.out.println(nextRecord[13]);
        Map<String, Set<String>> productToAppDRN = new HashMap<>();


        Set<String> appDRNs = new HashSet<>();
        while ((nextRecord = csvReader.readNext()) != null) {
            productToAppDRN.putIfAbsent(nextRecord[13], new HashSet<>());
            if (nextRecord[282] != "")
                productToAppDRN.get(nextRecord[13]).add(nextRecord[282]);
        }

        productToAppDRN.keySet().forEach(key -> {
            if (productToAppDRN.get(key).size() > 1)
                System.out.println(key + "\t" + productToAppDRN.get(key).size() + "\t" + productToAppDRN.get(key));
        });

    }
}
