package conduitApp;


import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConduitTest {

    @Test
    void testAll() {
        PrismMavenJobConfig config = new PrismMavenJobConfig(3, "127.0.0.1", 8080);
        //config.setDockerImage("iamsethi786/karate-api-test");
        Results results = Runner.path("classpath:conduitApp/feature").jobManager(config);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
