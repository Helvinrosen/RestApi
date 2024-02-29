package com.example.vehicle.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "userDetails")
public class VehicleLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customerId;
    String username;
    String email;
    String password;
    String customerphone;

     @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    List<Vehicle> vehicle=new ArrayList<>();
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCustomerphone() {
        return customerphone;
    }
    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public List<Vehicle> getVehicle() {
        return vehicle;
    }
    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
    

}
