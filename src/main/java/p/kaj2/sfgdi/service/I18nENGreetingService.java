package p.kaj2.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("I18n")
public class I18nENGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello World -- English ";
    }
}
