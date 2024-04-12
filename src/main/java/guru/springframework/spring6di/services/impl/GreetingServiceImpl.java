package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!";
    }
}
