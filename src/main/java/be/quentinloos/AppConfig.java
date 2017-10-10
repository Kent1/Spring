package be.quentinloos;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("be.quentinloos")
@PropertySource("classpath:/application.properties")
public class AppConfig {
}
