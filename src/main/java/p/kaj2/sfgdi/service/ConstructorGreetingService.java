package p.kaj2.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello world -- Constuctor";
    }

}
