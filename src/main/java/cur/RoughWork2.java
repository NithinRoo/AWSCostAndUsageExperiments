package cur;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class RoughWork2 {
    public static void main(String[] args) throws IOException {
        String rootPath = "/Users/nithinsingamsetti/Desktop/abr/";
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

        System.out.println(nnn.toString());
    }

    static Set<String> nnn = new HashSet<>();

    static void readCSVAndWriteToMap(Map<String, Integer> listMap, String path) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();
        String[] headers = nextRecord;
        System.out.println(Arrays.toString(headers));
        Set<String> starts = new HashSet<>();
        Set<String> ends = new HashSet<>();
        //int i = 0;
        while ((nextRecord = csvReader.readNext()) != null) {
            if (nextRecord[10].equals("RIFee")) {
                //i++;
                nnn.add(nextRecord[301]);
                System.out.println(nextRecord[301]);
                //System.out.println(Arrays.toString(nextRecord));
            }
        }
    }
}
