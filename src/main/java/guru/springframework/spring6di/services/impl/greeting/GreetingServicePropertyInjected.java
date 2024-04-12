package guru.springframework.spring6di.services.impl.greeting;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!";
    }
}
