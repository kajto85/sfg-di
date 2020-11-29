package p.kaj2.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("I18n")
public class I18nESGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hola amigo -- Espaniol";
    }
}
