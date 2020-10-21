package A1esandr.jblogtool;

import A1esandr.jblogtool.services.RemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private RemoteService remoteService;

    public HomeController(RemoteService remoteService){
        this.remoteService = remoteService;
    }

    @GetMapping("/blog")
    public String root() {
        return remoteService.get();
    }
}
