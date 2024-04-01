package in.neuw.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/apis/v1")
public class PingPongApi {

    @Value("${application.message}")
    private String applicationMessage;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/ping")
    public String ping() {
        return "pong message from app "+applicationName+" is -> "+applicationMessage;
    }

}
