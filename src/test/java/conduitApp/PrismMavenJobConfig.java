package conduitApp;

import com.intuit.karate.StringUtils;
import com.intuit.karate.job.MavenJobConfig;

public class PrismMavenJobConfig extends MavenJobConfig {

    public PrismMavenJobConfig(int executorCount, String host, int port) {
        super(executorCount, host, port);
    }


    @Override
    public String getExecutorCommand(String jobId, String jobUrl, int index) {
        String extra = StringUtils.isBlank(this.addOptions) ? "" : " " + this.addOptions;
        return "java -jar karate-1.0.1.jar -j http://127.0.0.1:8080";
    }


}
