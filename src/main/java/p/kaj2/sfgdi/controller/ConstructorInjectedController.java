package p.kaj2.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import p.kaj2.sfgdi.service.ConstructorGreetingService;
import p.kaj2.sfgdi.service.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;


    @Autowired
    public ConstructorInjectedController( @Qualifier("constructorGreetingService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greeting();
    }
}
