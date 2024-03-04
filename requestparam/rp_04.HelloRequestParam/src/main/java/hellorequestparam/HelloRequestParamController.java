package hellorequestparam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRequestParamController {

    @GetMapping("/hello")
    public String helloName(@RequestParam(value = "param", defaultValue = "World") String name) {
        return "Hello " + name;
    }

   
}
