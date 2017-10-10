package be.quentinloos;

import be.quentinloos.service.FleetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
//    DriverRepository driverRepository = new DriverRepositoryImpl();
//    FleetService fleetService = new FleetServiceImpl(driverRepository);

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    FleetService fleetService = applicationContext.getBean(FleetService.class);
    fleetService.displayGreeting();
    fleetService.getAllDrivers().forEach(System.out::println);
  }
}
