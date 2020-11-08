/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zetCode.repository;

import com.zetCode.model.CarDtoImpl;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dan
 */
@Repository
public interface CarRepositoryDto extends JpaRepository<CarDtoImpl, Integer> {

    public List<CarDtoImpl> findByOrderByCarNameDesc();

    public List<CarDtoImpl> findByOrderByCarNameAsc();

    public List<CarDtoImpl> findByOrderByCarModelDesc();

    public List<CarDtoImpl> findByOrderByCarModelAsc();

    public List<CarDtoImpl> findByCarModel(@Param(value = "carModel") String carOwner);

    public List<CarDtoImpl> findByCarOwner(@Param(value = "carOwner") String carOwner);

    public List<CarDtoImpl> findByCarName(String carName);

}
