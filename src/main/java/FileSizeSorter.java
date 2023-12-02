import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class FileSizeSorter {
    public static void main(String[] args) {
        System.out.println("hi");
        String directoryPath = "/Users/nithinsingamsetti/Desktop/splitFiles";

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            // Sort files by size
            Arrays.sort(files, Comparator.comparingLong(File::length).reversed());

            // Print filename and size
            for (File file : files) {
                double fileSizeMB = (double) file.length() / (1024 * 1024);
                System.out.printf("File: %s, Size: %.2f MB%n", file.getName(), fileSizeMB);
            }
        } else {
            System.out.println("Failed to read files from the directory.");
        }
    }
}