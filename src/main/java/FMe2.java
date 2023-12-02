import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FMe2 {
    public static void main(String[] args) {
        List<String> lineItemIds = Arrays.asList(loadArrayFromFile("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/ids.txt"));


        double[] values = loadDoubleArrayFromFile("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/costs.txt");


        System.out.println(lineItemIds.size());
        System.out.println(values.length);


        Map<String, List<Double>> map = new HashMap<>();

        for (int i = 0; i < values.length; i++) {
            map.putIfAbsent(lineItemIds.get(i), new ArrayList<>());
            map.get(lineItemIds.get(i)).add(values[i]);
        }

        double total = 0.0;
        for (String key : map.keySet()) {
            System.out.println(key + ":::" + "setSize::  " + new HashSet<>(map.get(key)).size() + "       listSize::  " + map.get(key).size() + map.get(key));
            for (double dd : map.get(key)) {
                total += dd;
            }
        }

        System.out.println(map.get("466xgnwhpqmpui6d5yxzfx543qn3oisbxrgthzaqzcpfxqt2r37a"));
        System.out.println(total);
    }

    public static String[] loadArrayFromFile(String filename) {
        try {
            return Files.readString(Paths.get(filename)).split(",");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[0]; // Return an empty array if an error occurs
    }

    public static double[] loadDoubleArrayFromFile(String filename) {
        try {
            String[] values = Files.readString(Paths.get(filename)).split(",");
            return Arrays.stream(values).mapToDouble(Double::parseDouble).toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new double[0]; // Return an empty array if an error occurs
    }

}
