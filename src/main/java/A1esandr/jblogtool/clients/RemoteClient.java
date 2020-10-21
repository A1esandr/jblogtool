package A1esandr.jblogtool.clients;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RemoteClient {
    private String apiKey;

    public RemoteClient() {

    }

    public String request() {
        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://localhost:8080/";
        ResponseEntity<String> response
                = restTemplate.getForEntity(resourceUrl + "/1", String.class);
        return "test";
    }

    public String getApiKey() {
        return null;
    }
}
