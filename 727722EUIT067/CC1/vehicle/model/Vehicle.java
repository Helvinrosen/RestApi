package com.example.vehicle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Service Booking")
public class Vehicle 
{
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    
    Long   customerId;
    String customerName;
    String customerPhNo;
    String customerCar;
    String carNumber;
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerPhNo() {
        return customerPhNo;
    }
    public void setCustomerPhNo(String customerPhNo) {
        this.customerPhNo = customerPhNo;
    }
    public String getCustomerCar() {
        return customerCar;
    }
    public void setCustomerCar(String customerCar) {
        this.customerCar = customerCar;
    }
    public String getCarNumber() {
        return carNumber;
    }
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    
    
}
