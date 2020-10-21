package A1esandr.jblogtool.services;

import A1esandr.jblogtool.clients.RemoteClient;
import org.springframework.stereotype.Service;

@Service
public class RemoteService {
    private RemoteClient remoteClient;

    public RemoteService(RemoteClient remoteClient) {
        this.remoteClient = remoteClient;
    }

    public String get(){
        return remoteClient.request();
    }
}
