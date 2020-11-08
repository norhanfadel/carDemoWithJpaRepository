package com.zetCode.model;
// Generated Nov 4, 2020, 10:58:36 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Car generated by hbm2java
 */
@Entity
@Table(name = "car",
         catalog = "test"
)
public class Car implements java.io.Serializable {

    private Integer carId;
    private String carName;
    private String carColor;
    private String carModel;
    private String carOwner;
    private String hidden;

    public Car() {
    }

    public Car(Integer carId, String carName, String carColor, String carModel, String carOwner) {
        this.carId = carId;
        this.carName = carName;
        this.carColor = carColor;
        this.carModel = carModel;
        this.carOwner = carOwner;
    }

    public Car(String carName, String carColor, String carModel, String carOwner, String hidden) {
        this.carName = carName;
        this.carColor = carColor;
        this.carModel = carModel;
        this.carOwner = carOwner;
        this.hidden = hidden;
    }

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

    @Column(name = "hidden", length = 45)
    public String getHidden() {
        return this.hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

}
