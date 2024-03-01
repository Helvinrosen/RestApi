package com.example.vehicle.service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle.model.Vehicle;
import com.example.vehicle.repo.VehicleRepo;

@Service
public class VehicleService {
    @Autowired
    VehicleRepo VehicleRepo;

    public Vehicle addVehicle(Vehicle Vehicle)
    {
        return VehicleRepo.save(Vehicle);
    }
    public List<Vehicle> getVehicle()
    {
        return VehicleRepo.findAll();
    }
    public Optional<Vehicle> findUser(Long id)
    {
        return VehicleRepo.findById(id);
    }
    public Vehicle edituser(Long id,Vehicle entity){
        Vehicle v=VehicleRepo.findById(id).orElse(null);
        if(v!=null){
            
            v.setCustomerPhNo(entity.getCustomerPhNo());
            v.setVehicleType(entity.getVehicleType());
            v.setVehicleNumber(entity.getVehicleNumber());
            return VehicleRepo.saveAndFlush(v);

        }   
        return null;
    }
    public String Delete(Long id){
        VehicleRepo.deleteById(id);
        return ("Deleted Successfully");
    }

}
