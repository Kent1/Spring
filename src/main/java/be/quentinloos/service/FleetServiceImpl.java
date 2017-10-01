package be.quentinloos.service;

import be.quentinloos.model.Driver;
import be.quentinloos.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fleetService")
public class FleetServiceImpl implements FleetService {

  private DriverRepository driverRepository;

  @Autowired
  public FleetServiceImpl(DriverRepository driverRepository) {
    this.driverRepository = driverRepository;
  }

  public List<Driver> getAllDrivers() {
    return driverRepository.getAllDrivers();
  }
}
