package p.kaj2.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import p.kaj2.sfgdi.service.GreetingService;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    @Autowired
    public I18nController(@Qualifier("I18n") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greeting();
    }
}
