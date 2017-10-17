package be.quentinloos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("be.quentinloos")
@PropertySource("classpath:/application.properties")
@EnableWebMvc
@SpringBootApplication
public class AppConfig extends SpringBootServletInitializer {

  public void main(String[] args) {
    SpringApplication.run(AppConfig.class, args);
  }

}
