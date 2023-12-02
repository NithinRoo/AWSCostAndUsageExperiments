package cur_test;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hii");
        //Unzip zip files
//        UnzipCSVFile("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_test/overwrite/cur-overwrite-test-00007.csv.zip"
//                , "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_test/overwrite");
//        UnzipCSVFile("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_test/create_new/prod_cost_service_report-00007.csv.zip"
//                , "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_test/create_new");

        //Test -1: Are the contents of createnew and overwrite same
        // Analysis: Number of records is same
        // Analysis: contents are same, CreateNewALatest and Overwritten one's, compared specific records

        FileReader createNewFilereader = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_test/create_new/jul17/prod_cost_service_report-00011.csv");
        CSVReader createNewCSVReader = new CSVReader(createNewFilereader);

        FileReader oWFilereader = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/cur_test/overwrite/jul17/cur-overwrite-test-00011.csv");
        CSVReader oWCSVReader = new CSVReader(oWFilereader);

        List<String> createNewList = new ArrayList<>();
        List<String> oWList = new ArrayList<>();

        String[] nextRecord = createNewCSVReader.readNext();

        int createNewCount = 0;
        while ((nextRecord = createNewCSVReader.readNext()) != null) {
            if (createNewCount == 1 || createNewCount == 78993 || createNewCount == 450000
                    || createNewCount == 868028) {
                createNewList.add(Arrays.toString(nextRecord));
            }
            createNewCount++;
        }

        nextRecord = oWCSVReader.readNext();
        int oWCount = 0;
        while ((nextRecord = oWCSVReader.readNext()) != null) {
            if (oWCount == 1 || oWCount == 78993 || oWCount == 450000
                    || oWCount == 868028) {
                oWList.add(Arrays.toString(nextRecord));
            }
            oWCount++;
        }

        System.out.println("createNewCount::" + createNewCount);
        System.out.println("oWCount::" + oWCount);

        for (int i = 0; i < createNewList.size(); i++) {
            System.out.println(createNewList.get(i).equals(oWList.get(i)));
        }

    }

    static void UnzipCSVFile(String zipFilePath, String outputFolder) {
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            byte[] buffer = new byte[1024];
            ZipEntry zipEntry;

            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                if (!zipEntry.isDirectory() && zipEntry.getName().endsWith(".csv")) {
                    String entryPath = outputFolder + File.separator + zipEntry.getName();
                    try (FileOutputStream fileOutputStream = new FileOutputStream(entryPath)) {
                        int length;
                        while ((length = zipInputStream.read(buffer)) > 0) {
                            fileOutputStream.write(buffer, 0, length);
                        }
                    }
                }
            }

            System.out.println("CSV file(s) extracted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


