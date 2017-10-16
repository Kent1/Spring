package be.quentinloos.service;

import be.quentinloos.entity.Driver;
import be.quentinloos.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

  @Transactional
  public void addDriver(Driver driver) {
    driverRepository.addDriver(driver);
  }

  @Override
  public String getGreeting() {
    return greeting;
  }

}
