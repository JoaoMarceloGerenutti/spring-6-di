package guru.springframework.spring6di.services.impl.environment;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "dev";
    }
}
