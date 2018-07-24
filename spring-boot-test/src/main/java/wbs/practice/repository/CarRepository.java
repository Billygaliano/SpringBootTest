package wbs.practice.repository;

import org.springframework.data.repository.CrudRepository;

import wbs.practice.model.Car;

public interface CarRepository extends CrudRepository<Car, Long>{

}
