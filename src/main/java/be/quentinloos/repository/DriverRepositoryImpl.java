package be.quentinloos.repository;

import be.quentinloos.entity.Driver;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class DriverRepositoryImpl implements DriverRepository {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public void addDriver(Driver driver) {
    System.out.println(driver);
    entityManager.persist(driver);
  }

  @Override
  public List<Driver> getAllDrivers() {
    TypedQuery<Driver> query = entityManager.createQuery("SELECT driver FROM Driver driver", Driver.class);
    return query.getResultList();
  }

}
