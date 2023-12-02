import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


public class Jun6OWAllFilesProcessor {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        String rootPath = "/Users/nithinsingamsetti/Desktop/jun_cur_ow/";

        Map<String, Integer> listMap = new ConcurrentHashMap<>();
        List<String> fileNames = Files.list(Paths.get("/Users/nithinsingamsetti/Desktop/jun_cur_ow/"))
                .filter(file -> file.getFileName().toString().contains("csv"))
                .map(file -> {
                    return file.getFileName().toString();
                }).toList();

        Set<String> billingStartDate = new HashSet<>();
        fileNames.parallelStream().forEach(fileName -> {
                    try {
                        System.out.println(fileName);
                        readCSVAndWriteToMap(listMap, rootPath + fileName, billingStartDate);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        System.out.println(billingStartDate);
        System.out.println("hi");

//        fileNames.forEach(fileName -> {
//            try {
//                System.out.println(fileName);
//                readCSVAndWriteToMap(listMap, rootPath + fileName);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });

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

    static void readCSVAndWriteToMap(Map<String, Integer> listMap, String path, Set<String> billingStartDate) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();
        String[] headers = nextRecord;
        System.out.println(path);
        while ((nextRecord = csvReader.readNext()) != null) {
//            String key = nextRecord[0] + "_" + nextRecord[11] + "_" + nextRecord[12];
            String key = nextRecord[0];
            billingStartDate.add(nextRecord[7]);
            listMap.putIfAbsent(key, 0);
            //listMap.get(key).add(Arrays.toString(nextRecord));
            listMap.put(key, listMap.get(key) + 1);
//            listMap.get(key).add("_" + nextRecord[11] + "_" + nextRecord[12] + "______" + path);
        }
    }
}


