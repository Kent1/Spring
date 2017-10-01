package be.quentinloos.service;

import be.quentinloos.model.Driver;
import be.quentinloos.repository.DriverRepository;

import java.util.List;

public class FleetServiceImpl implements FleetService {

  private DriverRepository driverRepository;

  public FleetServiceImpl(DriverRepository driverRepository) {
    this.driverRepository = driverRepository;
  }

  public List<Driver> getAllDrivers() {
    return driverRepository.getAllDrivers();
  }
}
