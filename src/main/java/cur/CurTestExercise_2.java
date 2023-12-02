package cur;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CurTestExercise_2 {
    public static void main(String[] args) throws IOException {
        String rootPath = "/Users/nithinsingamsetti/Desktop/cur_test_exercise/";

        // Jul 3rd,4th and 5th data

        //Checks
        /*
            1. Is LineitemId + startdate + enddate is having unique unblendedcost.
         */

        Map<String, Set<String>> listMap = new HashMap<>();
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
                    if (listMap.get(key).size() > 1) {
                        System.out.println(key + "________________" + listMap.get(key).size()
                                + "________________" + listMap.get(key).toString());
                    }
                }
        );
    }

    static void readCSVAndWriteToMap(Map<String, Set<String>> listMap, String path) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();

        System.out.println(Arrays.toString(nextRecord));
        while ((nextRecord = csvReader.readNext()) != null) {
            if(nextRecord[0].equals("gmtlwgyulpbls52ckcf4j5ukkqx2uya5rs4lcyejxen6fjpahrka")){
                System.out.println(path);
                System.out.println(Arrays.toString(nextRecord));
            }
            String key = nextRecord[0] + "_" + nextRecord[11] + "_" + nextRecord[12];
            listMap.putIfAbsent(key, new HashSet<>());
            listMap.get(key).add(nextRecord[23]);
        }
    }
}


