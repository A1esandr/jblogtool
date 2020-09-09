package A1esandr.jblogtool;

import A1esandr.jblogtool.clients.RemoteClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest()
@ActiveProfiles("test")
public class RemoteClientTest {
    private RemoteClient remoteClient;

    @Before
    public void setUp() {
        remoteClient = new RemoteClient();
    }

    @Test
    public void testRemoteClient_has_APIKey() {
        assertTrue(remoteClient.getApiKey() != null);
    }
}
