package com.example.vehicle.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.model.VehicleLogin;
import com.example.vehicle.service.VehicleLoginService;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class VehicleLoginContrtoller {
    @Autowired
    VehicleLoginService vehicleLoginService;

    @PostMapping("/addlog")
    public VehicleLogin addVehicleLogin(@RequestBody VehicleLogin vehicleLogin) 
    {
        return vehicleLoginService.addVehicleLogin(vehicleLogin);
    }
    @GetMapping("/getlog/{a}/{b}")
    public List<VehicleLogin> getVehicleLogin(@PathVariable int a,@PathVariable int b) {
        return vehicleLoginService.getVehicleLogin(a,b);
    }

    @GetMapping("/getlog/{Id}")
    public Optional<VehicleLogin> getUserById(@PathVariable Long Id) {
        return vehicleLoginService.findUser(Id);
    }

    @PutMapping("/putlog/{Id}")
    public VehicleLogin putUserId(@PathVariable Long Id, @RequestBody VehicleLogin vehicleLogin) {
        
        return vehicleLoginService.editUser(Id, vehicleLogin);
    }
    @DeleteMapping("/dellog")
    public String deleteAll()
    {
        return vehicleLoginService.DelAll();
    }

    @DeleteMapping("/dellog/{Id}")
    public String Delete(@PathVariable Long Id)
    {
        return(vehicleLoginService.Delete(Id));
    }
    
    
    
    

    
}
