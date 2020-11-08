/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zetCode.service;

import com.zetCode.InvalidParameterException;
import com.zetCode.model.Car;
import com.zetCode.model.CarDtoImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zetCode.repository.CarRepositoryDto;
import com.zetCode.repository.CarRepository;

/**
 *
 * @author Dan
 */
@Service
public class CarService {

    @Autowired
    private CarRepositoryDto carRepositoryDto;
    @Autowired
    private CarRepository carRepository;

    public Optional<CarDtoImpl> getCarById(int id) throws InvalidParameterException {
        if (!carRepositoryDto.findById(id).isPresent()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findById(id);

        }
    }

    public Car newCar(Car newCar) throws InvalidParameterException {
        {
            return carRepository.save(newCar);

        }
    }

    public Car replaceCar(Car newCar, int id) throws InvalidParameterException {
        {

            return carRepository.findById(id)
                    .map(car -> {
                        car.setCarName(newCar.getCarName());
                        car.setCarColor(newCar.getCarColor());
                        car.setCarModel(newCar.getCarModel());
                        car.setCarOwner(newCar.getCarOwner());
                        car.setHidden(newCar.getHidden());
                        return carRepository.save(car);
                    })
                    .orElseGet(() -> {
                        newCar.setCarId(id);
                        return carRepository.save(newCar);
                    });
        }
    }

    public String deleteCar(int id) throws InvalidParameterException {
        if (!carRepository.findById(id).isPresent()) {
            return "Car Id is False";
        } else {

            carRepository.deleteById(id);
            return "Delete done";

        }
    }

    public List<CarDtoImpl> findByCarModel(String model) throws InvalidParameterException {
        if (carRepositoryDto.findByCarModel(model).isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findByCarModel(model);

        }
    }

    public List<CarDtoImpl> findByCarOwner(String owner) throws InvalidParameterException {
        if (carRepositoryDto.findByCarOwner(owner).isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findByCarOwner(owner);

        }
    }

    public List<CarDtoImpl> findByCarName(String name) throws InvalidParameterException {
        if (carRepositoryDto.findByCarName(name).isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findByCarName(name);
        }
    }

    public List<CarDtoImpl> findByOrderByCarNameAsc() throws InvalidParameterException {
        if (carRepositoryDto.findByOrderByCarNameAsc().isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findByOrderByCarNameAsc();

        }
    }

    public List<CarDtoImpl> findByOrderByCarNameDesc() throws InvalidParameterException {
        if (carRepositoryDto.findByOrderByCarNameDesc().isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findByOrderByCarNameDesc();
        }
    }

    public List<CarDtoImpl> findByOrderByCarModelAsc() throws InvalidParameterException {
        if (carRepositoryDto.findByOrderByCarModelAsc().isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {

            return carRepositoryDto.findByOrderByCarModelAsc();

        }

    }

    public List<CarDtoImpl> findByOrderByCarModelDesc() throws InvalidParameterException {
        if (carRepositoryDto.findByOrderByCarModelDesc().isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findByOrderByCarModelDesc();

        }
    }

    public List<CarDtoImpl> findAllCars() throws InvalidParameterException {
        if (carRepositoryDto.findAll().isEmpty()) {
            throw new InvalidParameterException("not valid parameter");
        } else {
            return carRepositoryDto.findAll();

        }
    }
}
