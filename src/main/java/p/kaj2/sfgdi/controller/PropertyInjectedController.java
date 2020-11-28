package p.kaj2.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import p.kaj2.sfgdi.service.GreetingService;
import p.kaj2.sfgdi.service.PropertyGreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
       return greetingService.greeting();
    }


}
