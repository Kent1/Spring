package be.quentinloos.service;

import be.quentinloos.model.Driver;
import be.quentinloos.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FleetServiceImpl implements FleetService {

  private DriverRepository driverRepository;

  @Value("${message.greeting}")
  private String greeting;

  @Autowired
  public FleetServiceImpl(DriverRepository driverRepository) {
    this.driverRepository = driverRepository;
  }

  public List<Driver> getAllDrivers() {
    return driverRepository.getAllDrivers();
  }

  @Override
  public void displayGreeting() {
    System.out.println(greeting);
  }

}
