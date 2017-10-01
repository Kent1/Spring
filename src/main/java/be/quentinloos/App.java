package be.quentinloos;

import be.quentinloos.repository.DriverRepository;
import be.quentinloos.repository.DriverRepositoryImpl;
import be.quentinloos.service.FleetService;
import be.quentinloos.service.FleetServiceImpl;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    DriverRepository driverRepository = new DriverRepositoryImpl();
    FleetService fleetService = new FleetServiceImpl(driverRepository);

    fleetService.getAllDrivers().forEach(System.out::println);
  }
}
