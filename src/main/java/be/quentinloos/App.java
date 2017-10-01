package be.quentinloos;

import be.quentinloos.service.FleetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
//    DriverRepository driverRepository = new DriverRepositoryImpl();
//    FleetService fleetService = new FleetServiceImpl(driverRepository);

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    FleetService fleetService = applicationContext.getBean("fleetService", FleetService.class);
    fleetService.getAllDrivers().forEach(System.out::println);
  }
}
