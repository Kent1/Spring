package be.quentinloos.repository;

import be.quentinloos.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Long> {

  List<Driver> findAllByCar_Brand(String brand);

}
