package com.zetCode.controller;

import com.zetCode.InvalidParameterException;
import com.zetCode.model.Car;
import com.zetCode.model.CarDtoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.zetCode.service.CarService;

@RestController
public class Controller {

    @Autowired
    CarService carService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/car/{id}")
    public Optional<CarDtoImpl> getCarById(@PathVariable int id) throws InvalidParameterException {

        return carService.getCarById(id);

    }

    @PostMapping("/newCar")
    Car newCar(@RequestBody Car newCar) throws InvalidParameterException {

        return carService.newCar(newCar);

    }

    @PutMapping("/replaceCar/{id}")
    Car replaceCar(@RequestBody Car newCar,
            @PathVariable int id) throws InvalidParameterException {

        return carService.replaceCar(newCar, id);

    }

    @DeleteMapping("deleteCar/{id}")
    public String deleteCar(@PathVariable("id") int id) throws InvalidParameterException {
        if (carService.deleteCar(id).
                equals("Car Id is False")) {
            return "Car Id is False";
        } else {
            return "Delete done";

        }
    }

    @GetMapping("/findByCarModel/{model}")
    public List<CarDtoImpl> findByCarModel(@PathVariable String model) throws InvalidParameterException {

        return carService.findByCarModel(model);

    }

    @GetMapping("/findByCarOwner/{owner}")
    public List<CarDtoImpl> findByCarOwner(@PathVariable String owner) throws InvalidParameterException {

        return carService.findByCarOwner(owner);
    }

    @GetMapping("/findByCarName/{name}")
    public List<CarDtoImpl> findByCarName(@PathVariable String name) throws InvalidParameterException {

        return carService.findByCarName(name);
    }

    @GetMapping("/findByOrderByCarNameAsc")
    public List<CarDtoImpl> findByOrderByCarNameAsc() throws InvalidParameterException {

        return carService.findByOrderByCarNameAsc();

    }

    @GetMapping("/findByOrderByCarNameDesc")
    public List<CarDtoImpl> findByOrderByCarNameDesc() throws InvalidParameterException {

        return carService.findByOrderByCarNameDesc();
    }

    @GetMapping("/findByOrderByCarModelAsc")
    public List<CarDtoImpl> findByOrderByCarModelAsc() throws InvalidParameterException {

        return carService.findByOrderByCarModelAsc();
    }

    @GetMapping("/findByOrderByCarModelDesc")
    public List<CarDtoImpl> findByOrderByCarModelDesc() throws InvalidParameterException {

        return carService.findByOrderByCarModelDesc();
    }

    @GetMapping("/findAllCars")
    public List<CarDtoImpl> findAllCars() throws InvalidParameterException {

        return carService.findAllCars();

    }
}
