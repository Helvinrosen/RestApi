package com.example.vehicle.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.model.Vehicle;
import com.example.vehicle.service.VehicleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping("/adduser")
    public Vehicle addVehicle(@RequestBody Vehicle Vehicle) {
        //TODO: process POST request
        
        return vehicleService.addVehicle(Vehicle);
    }

    @GetMapping("/getuser")
    public List<Vehicle> getVehicle() {
        return vehicleService.getVehicle();
    }

    @GetMapping("/getuser/{id}")
    public Optional<Vehicle> getVehicleById(@PathVariable Long id) {
        return vehicleService.findUser(id);
    }
    @PutMapping("/put/{id}")
    public Vehicle putMethodName(@PathVariable Long id, @RequestBody Vehicle entity) {
        
        return vehicleService.edituser(id, entity);
        
    }
    @DeleteMapping("/del/{id}")
    public String Delete(Long Id){
        return(vehicleService.Delete(Id));
        
    }    
    
    
}
