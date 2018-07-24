package wbs.practice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import wbs.practice.model.Car;
import wbs.practice.service.CarService;

/**
 * Controller that handles HTTP requests
 * 
 * @author Guillermo Galiano
 *
 */
@RestController
public class RestApiController {

    @Autowired
    private CarService carService;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @RequestMapping(value = "/api/cars", method=RequestMethod.GET)
    public ResponseEntity<Car> getAll() {
        List<Car> cars = carService.getAll();
        return new ResponseEntity(cars, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/car", method = RequestMethod.GET)
    public ResponseEntity<Car> getCarById(@RequestParam(value = "id") Long id) {
        Car car = carService.getById(id);
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/api/add-car", method = RequestMethod.POST)
    public ResponseEntity<Car> create(@Valid @RequestBody Car car) {
        Car carCreated = carService.create(car);
        return new ResponseEntity(carCreated, HttpStatus.CREATED);
    }

}
