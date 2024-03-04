package hellorequestparams;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRequestParamsController {

    @GetMapping("/hello")
    public String printHello(@RequestParam String param) {
        return "Hello " + param;
    }

    @GetMapping("/params")
    public Map<String, String> printParams(@RequestParam Map<String, String> parameters) {
        return parameters;
    }

    
}
