package p.kaj2.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("hello world");
        return "Hi folks!";
    }
}
