import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


public class Jun6OWAllFilesQuery {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        String rootPath = "/Users/nithinsingamsetti/Desktop/jun_cur_ow/";

        Map<String, Double> listMap = new ConcurrentHashMap<>();
        List<String> fileNames = Files.list(Paths.get("/Users/nithinsingamsetti/Desktop/jun_cur_ow/"))
                .filter(file -> file.getFileName().toString().contains("csv"))
                .map(file -> {
                    return file.getFileName().toString();
                }).toList();

        Set<String> products = new HashSet<>();
        fileNames.parallelStream().forEach(fileName -> {
                    try {
                        System.out.println(fileName);
                        readCSVAndWriteToMap(listMap, rootPath + fileName, products);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        System.out.println(products);
        System.out.println(listMap.get("ddd"));

        AtomicInteger count = new AtomicInteger();
        listMap.keySet().forEach(
                key -> {
                    if (listMap.get(key) > 1) {
                        count.getAndIncrement();
                        System.out.println("found");
//                        System.out.println(key);
//                        System.exit(0);
                        System.out.println(key + "----->" + listMap.get(key));
                    }
                }
        );
        System.out.println(count.get());
        System.out.println("done");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    static void readCSVAndWriteToMap(Map<String, Double> listMap, String path, Set<String> products) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();
        String[] headers = nextRecord;
        System.out.println(path);
        while ((nextRecord = csvReader.readNext()) != null) {
            if (nextRecord[274].equals("drn:roo:supportable:xx:dc290c2a-3285-448b-b3c1-27bf2345fa94")
                    && (nextRecord[1].split("/")[0].contains("2023-06-27")
                    || nextRecord[1].split("/")[0].contains("2023-06-28")
                    || nextRecord[1].split("/")[0].contains("2023-06-23")
                    || nextRecord[1].split("/")[0].contains("2023-06-24")
                    || nextRecord[1].split("/")[0].contains("2023-06-25")
                    || nextRecord[1].split("/")[0].contains("2023-06-26")
                    || nextRecord[1].split("/")[0].contains("2023-06-22")
            )
//                    && nextRecord[13].equals("AmazonRDS")
            ) {
                products.add(nextRecord[13]);
                listMap.putIfAbsent("ddd", 0.0);
                try {
                    listMap.put("ddd", Double.parseDouble(nextRecord[23]) + listMap.get("ddd"));
                } catch (NumberFormatException e) {
                    System.out.println(headers[23]);
                    System.out.println(nextRecord[23]);
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


//2023-06-21T00:00:00Z/2023-06-22T00:00:00Z