import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class RoughWork1 {
    public static void main(String[] args) throws IOException {
        String rootPath = "/Users/nithinsingamsetti/Desktop/ttn/";
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
    }

    static void readCSVAndWriteToMap(Map<String, Integer> listMap, String path) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();
        String[] headers = nextRecord;
        System.out.println(Arrays.toString(headers));
        Set<String> starts = new HashSet<>();
        Set<String> ends = new HashSet<>();
        int i =0;
        while ((nextRecord = csvReader.readNext()) != null && i<10) {
            if (nextRecord[281].equals("rs-subway-partner")){
                i++;
                System.out.println(Arrays.toString(nextRecord));
            }
        }
    }
}


