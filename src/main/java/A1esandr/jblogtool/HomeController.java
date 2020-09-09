package A1esandr.jblogtool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/blog")
    public String root() {
        return "";
    }
}
