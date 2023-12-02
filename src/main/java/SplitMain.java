import com.opencsv.CSVReader;
import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;

public class SplitMain {
    public static void splitMain(String[] args) throws FileNotFoundException {
        FileReader filereader = new FileReader(
                "/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/prod_cost_service_report-00001.csv");

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;
        Iterator<String[]> iterator = csvReader.iterator();
        String[] columns = iterator.next();
        CurMain.writeToCSVFile("splitData", Arrays.toString(columns));
        final int[] i = {0};
        Arrays.stream(columns).forEach(column -> {
            System.out.println(column + "___" + i[0]);
            i[0]++;
        });

        int totalCount = 5000;
        while (iterator.hasNext()) {
            columns = iterator.next();
            //274 to 283
            for (int ind = 274; ind < 284 && totalCount > 0; ind++) {
                if (!StringUtils.isEmpty(columns[ind])) {
                    CurMain.writeToCSVFile("splitData", "\n");
                    CurMain.writeToCSVFile("splitData", Arrays.toString(columns));
                    totalCount--;
                    continue;
                }
            }
        }
    }
}
