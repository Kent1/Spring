package be.quentinloos;

import be.quentinloos.model.Car;
import be.quentinloos.model.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
@ComponentScan("be.quentinloos")
@PropertySource("classpath:/application.properties")
public class AppConfig {

  @Bean
  public List<Driver> drivers() {
    Car car = new Car();
    car.setBrand("Mercedes");
    car.setModel("Class A");
    car.setVersion("180");
    car.setPlateNumber("1-ABC-123");

    Driver driver = new Driver();
    driver.setFirstname("Jeremy");
    driver.setLastname("Schmidt");
    driver.setCar(car);

    return new ArrayList<>(Collections.singletonList(driver));
  }

}
