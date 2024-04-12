package guru.springframework.spring6di.controllers.greeting;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.impl.greeting.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
