import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadTextFile {
    public static void main(String[] args) {
        try {
            String text = Files.readString(Paths.get("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/a.txt"));
            List<String> stringSet1 = new ArrayList<>(Arrays.asList(text.split(",")));

            String text1 = Files.readString(Paths.get("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/b.txt"));
            List<String> stringSet2 = new ArrayList<>(Arrays.asList(text1.split(",")));

            stringSet1.forEach(e -> {
                if (!stringSet2.contains(e)) {
                    System.out.print(e);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
