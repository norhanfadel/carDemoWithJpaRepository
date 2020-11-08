/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zetCode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dan
 */
@Entity
@Table(name = "car",
         catalog = "test"
)
public class CarDtoImpl implements java.io.Serializable {

    private Integer carId;
    private String carName;
    private String carColor;
    private String carModel;
    private String carOwner;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "car_id", unique = true, nullable = false)
    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Column(name = "car_name", length = 45)
    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Column(name = "car_color", length = 45)
    public String getCarColor() {
        return this.carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Column(name = "car_model", length = 45)
    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Column(name = "car_owner", length = 45)
    public String getCarOwner() {
        return this.carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

}
