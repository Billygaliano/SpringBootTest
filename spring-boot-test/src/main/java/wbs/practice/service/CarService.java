package wbs.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wbs.practice.model.Car;
import wbs.practice.repository.CarRepository;

/**
 * Car Service that gives the API REST the required function 
 * 
 * @author Guillermo Galiano
 *
 */
@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    /**
     * Obtain a car by its ID
     * 
     * @param carId id of car we want to get 
     * @return car we want to get
     */
    public Car getById(Long carId) {
        return (Car) repository.findById(carId).orElseThrow(() -> null);
    }

    /**
     * Obtain all cars of Data Base
     * 
     * @return all cars of Data Base
     */
    public List<Car> getAll() {
        Iterable<Car> cars = repository.findAll();
        List<Car> list = new ArrayList<Car>();
        cars.forEach(list::add);
        return list;
    }
 
    /**
     * Persists a car in Data Base
     * 
     * @param car Car we want to persists
     * @return Car persisted
     */
    public Car create(Car car) {
        return repository.save(car);
    }
}
