import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CurTestExercise_1 {
    public static void main(String[] args) throws IOException {
        String rootPath = "/Users/nithinsingamsetti/Desktop/cur_test_exercise/";

        // Jul 3rd,4th and 5th data

        //Checks
        /*
            1. Is LineitemId + startdate + enddate is unique
            Answer: No. its repeating in multiple files, with same combination
         */

        Map<String, Integer> listMap = new HashMap<>();
        List<String> fileNames = Arrays.asList(
                "jul3rd/1.csv",
                "jul3rd/2.csv",
                "jul3rd/3.csv",
                "jul4th/1.csv",
                "jul4th/2.csv",
                "jul5th/1.csv"
        );
        System.out.println("hi");
        fileNames.forEach(fileName -> {
            try {
                readCSVAndWriteToMap(listMap, rootPath + fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println(listMap.size());
        listMap.keySet().parallelStream().forEach(
                key -> {
                    if (listMap.get(key) > 2) {
                        System.out.println(listMap.get(key));
                    }
                }
        );
    }

    static void readCSVAndWriteToMap(Map<String, Integer> listMap, String path) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();
        String[] headers = nextRecord;
        System.out.println(Arrays.toString(headers));

        while ((nextRecord = csvReader.readNext()) != null) {
//            if (nextRecord[0].equals("yb6tivxzk2sobnqs7wou3tzbhcaavgtghrvckqzymhkmsatwn4ja")) {
//                System.out.println(path);
//                System.out.println(Arrays.toString(nextRecord));
//            }
            String key = nextRecord[0] + "_" + nextRecord[11] + "_" + nextRecord[12];
            listMap.putIfAbsent(key, 0);
            listMap.put(key, listMap.get(key) + 1);
        }
    }
}


