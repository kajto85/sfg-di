package p.kaj2.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello world -- Primary Bean";
    }
}
