package cur_test;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LinItemIdCheck {
    public static void main(String[] args) {
        String rootPath = "/Users/nithinsingamsetti/Desktop/jul18_cn/";

        //Checks
        /*
            1. Is LineitemId unique?
                No(even in 1 file)
            2. Is LineitemId + startdate + enddate is unique?
                Unique in 1 file
                Unique in multiple files too[same in create new also in a given frame, its unique]
         */

        Map<String, Integer> listMap = new HashMap<>();
        List<String> fileNames = List.of(
                "prod_cost_service_report-00001.csv",
                "prod_cost_service_report-00002.csv",
                "prod_cost_service_report-00003.csv",
                "prod_cost_service_report-00004.csv",
                "prod_cost_service_report-00005.csv",
                "prod_cost_service_report-00006.csv",
                "prod_cost_service_report-00007.csv",
                "prod_cost_service_report-00009.csv",
                "prod_cost_service_report-00010.csv",
                "prod_cost_service_report-00011.csv",
                "prod_cost_service_report-00012.csv"
        );
        System.out.println("hi");
        fileNames.forEach(fileName -> {
            try {
                readCSVAndWriteToMap(listMap, rootPath + fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

//        System.out.println(listMap.size());
        listMap.keySet().forEach(
                key -> {
                    if (listMap.get(key) > 1) {
                        System.out.println(key);
                        System.exit(0);
                    }
                }
        );
        System.out.println("done");
    }

    static void readCSVAndWriteToMap(Map<String, Integer> listMap, String path) throws IOException {
        FileReader filereader = new FileReader(path);

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord = csvReader.readNext();
        String[] headers = nextRecord;
        System.out.println(path);
        System.out.println(nextRecord[10]);
        Set<String> ll = new HashSet<>();
        while ((nextRecord = csvReader.readNext()) != null) {
//            String key = nextRecord[0] + "_" + nextRecord[11] + "_" + nextRecord[12];
            String key = nextRecord[0];
            listMap.putIfAbsent(key, 0);
            //listMap.get(key).add(Arrays.toString(nextRecord));
            listMap.put(key, listMap.get(key) + 1);
            ll.add(nextRecord[10]);
        }
        System.out.println(ll.toString());
    }
}


