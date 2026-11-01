package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "hi")
    public String h1(){
        return "OMAE WA MOU SHINDE IRU";
    }

}
