package guru.springframework.spring6di.services.impl.environment;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentServiceUAT implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "uat";
    }
}
