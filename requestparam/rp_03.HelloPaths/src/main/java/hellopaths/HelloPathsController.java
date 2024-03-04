package hellopaths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPathsController {

    @GetMapping("/hello")
    public String printHello() {
        return "Hello";
    }

    @GetMapping("/paths")
    public String printPaths() {
        return "Paths";
    }

    

}
