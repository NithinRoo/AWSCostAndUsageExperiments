import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.apache.commons.lang3.StringUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainWithLimitOptimized {
    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/filename.csv");

        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;

        // instantiating and populating columns.
        List<String> columns = new ArrayList<>();
        int i = 0;
        while ((nextRecord = csvReader.readNext()) != null && i < 1) {
            Collections.addAll(columns, nextRecord);
            i++;
        }

        System.out.println(columns);
        // 14th column is the product type
        //print all products
        HashSet<String> allProducts = new HashSet<>();
        allProducts.addAll(List.of("comprehend", "AWSTransfer", "AWSCertificateManager", "AWSSecretsManager", "AmazonSimpleDB",
                "AmazonQuickSight", "translate", "AmazonNeptune", "AppFlow", "AmazonRedshift", "AmazonCloudWatch", "AmazonInspectorV2",
                "AWSCloudShell", "AmazonAthena", "AWSDatabaseMigrationSvc", "AmazonTimestream", "AmazonLex", "AmazonGuardDuty", "AWSELB",
                "AmazonSageMaker", "AWSDirectoryService", "AmazonECS", "AWSXRay", "AmazonECR", "AWSGlue", "AmazonDAX", "AWSEvents", "AmazonApiGateway",
                "AmazonRoute53", "AmazonKinesisAnalytics", "AmazonEKS", "AWSCostExplorer", "AWSFMS", "ComputeSavingsPlans", "AWSCloudTrail", "AWSCodePipeline",
                "AmazonMSK", "AmazonWorkMail", "AWSQueueService", "AmazonKinesis", "AmazonS3", "AWSLambda", "AmazonGlacier", "AmazonRDS", "AWSSecurityHub",
                "AWSSystemsManager", "AmazonLightsail", "AmazonEC2", "AmazonConnect", "CodeBuild", "AWSBackup", "AmazonSNS", "AWSConfig", "ContactCenterTelecomm",
                "AmazonEFS", "AWSCodeArtifact", "datapipeline", "AmazonElastiCache", "AmazonCloudFront", "AmazonDevOpsGuru", "AWSServiceCatalog", "AmazonVPC", "AWSDataTransfer", "AmazonSES", "AmazonStates",
                "ElasticMapReduce", "AmazonDynamoDB", "AmazonTextract", "AWSAppSync", "AmazonES", "AmazonRekognition", "awskms", "AmazonKinesisFirehose"));


        csvReader = new CSVReader(filereader);

        Map<String, Map<String, Set<String>>> productToEachAttributeToValues = new HashMap<>();

        csvReader.readNext();
        // populate {product -> (Attribute,Allvalues))}
        allProducts.forEach(e -> {
            productToEachAttributeToValues.put(e, new HashMap<>());
            for (String column : columns) {
                productToEachAttributeToValues.get(e).put(column, new HashSet<>());
            }
        });

//        System.out.println(productToEachAttributeToValues.keySet());

        FileReader filereader1 = new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/filename.csv");
        CSVReader csvReader1 = new CSVReader(filereader1);
        csvReader1.readNext();
        while ((nextRecord = csvReader1.readNext()) != null) {
            for (int k = 0; k < nextRecord.length; k++) {
                if (productToEachAttributeToValues.get(nextRecord[14]).get(columns.get(k)).size() < 15) {
                    productToEachAttributeToValues.get(nextRecord[14]).get(columns.get(k)).add(nextRecord[k]);
                }
            }
        }
        writeToCSV("AmazonEC2", productToEachAttributeToValues.get("AmazonEC2"));
        //writeToFile("AmazonEC2", String.valueOf(productToEachAttributeToValues.get("AmazonEC2")));
    }

    static void writeToFile(String fileName, String text) {
        System.out.println("hi");
        try {
            Files.write(Paths.get("/Users/nithinsingamsetti/Desktop/" + fileName + "_15Tags.txt"), text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void writeToCSV(String fileName, Map<String, Set<String>> map) {
        System.out.println("hi");
        try {
            final CSVWriter writer = new CSVWriter(
                    new FileWriter("/Users/nithinsingamsetti/Desktop/" + fileName + "_15Tags_corrected.csv"));
            //Create record

            List<String> sortedKeys = new ArrayList(map.keySet());
            Collections.sort(sortedKeys);

            for (String key : sortedKeys) {
                String[] record = new String[2];
                record[0] = key;
                record[1] = StringUtils.join(map.get(key), ";");
                writer.writeNext(record, false);
                writer.flush();
            }
            //close the writer
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
