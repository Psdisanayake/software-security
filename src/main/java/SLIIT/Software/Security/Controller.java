package SLIIT.Software.Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "Hello SLIIT";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "Please log in";
    }

}
