package cur;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.costexplorer.AWSCostExplorer;
import com.amazonaws.services.costexplorer.AWSCostExplorerClientBuilder;
import com.amazonaws.services.costexplorer.model.*;


import java.util.List;

public class CostExplorer {
    public static void main(String[] args) {
        BasicAWSCredentials credentials = new BasicAWSCredentials("fill_this", "fill_this");

        AWSCostExplorer client = AWSCostExplorerClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("eu-west-1") // or other region
                .build();

        DateInterval interval = new DateInterval();
        interval.setStart("2023-01-01");
        interval.setEnd("2023-01-31");

        GetCostAndUsageRequest request = new GetCostAndUsageRequest()
                .withTimePeriod(interval)
                .withGranularity("DAILY")
                .withMetrics("UnblendedCost")
                .withGroupBy(new GroupDefinition().withType("DIMENSION").withKey("SERVICE"));


        GetCostAndUsageResult response = client.getCostAndUsage(request);

        List<ResultByTime> categories = response.getResultsByTime();
        for (ResultByTime category : categories) {
            System.out.println(category.getTimePeriod().getStart() + " - " +
                    category.getTimePeriod().getEnd() + ": " + category.getGroups());
        }
    }

}
