package p.kaj2.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import p.kaj2.sfgdi.service.GreetingService;
import p.kaj2.sfgdi.service.SetterGreetingServiceImp;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterGreetingServiceImp")
    @Autowired
    public void setGreetingService( GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greeting();
    }
}
