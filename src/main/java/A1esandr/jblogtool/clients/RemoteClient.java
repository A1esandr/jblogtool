package A1esandr.jblogtool.clients;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RemoteClient {
    private String apiKey;

    public RemoteClient() {

    }

    public void request() {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/";
        ResponseEntity<String> response
                = restTemplate.getForEntity(resourceUrl + "/1", String.class);
    }

    public String getApiKey() {
        return null;
    }
}
