package be.quentinloos.repository;

import be.quentinloos.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Long> {

  List<Driver> findAllByCar_Brand(String brand);

  @Query("SELECT driver FROM Driver driver WHERE driver.firstname = :firstname")
  List<Driver> findByDriverFirstname(@Param("firstname") String firstname);

}
