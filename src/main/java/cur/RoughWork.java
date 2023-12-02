package cur;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class RoughWork {
    public static void main(String[] args) throws IOException {
        String rootPath = "/Users/nithinsingamsetti/Desktop/uuu/";

        Map<String, Integer> listMap = new HashMap<>();
        List<String> fileNames = Files.list(Paths.get(rootPath))
                .filter(file -> file.getFileName().toString().contains("csv"))
                .map(file -> {
                    return file.getFileName().toString();
                }).toList();

        fileNames.forEach(fileName -> {
            try {
                System.out.println(fileName);
                readCSVAndWriteToMap(listMap, rootPath + fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        AtomicInteger count = new AtomicInteger();
        AtomicInteger repeatCount = new AtomicInteger();
        listMap.keySet().forEach(
                key -> {
                    count.getAndIncrement();
                    if (listMap.get(key) > 1) {
//                        System.out.println(key);
//                        System.exit(0);
                        repeatCount.getAndIncrement();
                    }
                }
        );
        System.out.println("done");
        System.out.println(repeatCount.get());
        System.out.println(count.get());
    }

    static void readCSVAndWriteToMap(Map<String, Integer> listMap, String path) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();
        String[] headers = nextRecord;
        System.out.println(path);
        while ((nextRecord = csvReader.readNext()) != null) {
            String key = nextRecord[0] + "_" + nextRecord[11] + "_" + nextRecord[12];
//            String key = nextRecord[0];
            listMap.putIfAbsent(key, 0);
            //listMap.get(key).add(Arrays.toString(nextRecord));
            listMap.put(key, listMap.get(key) + 1);
        }
    }
}


