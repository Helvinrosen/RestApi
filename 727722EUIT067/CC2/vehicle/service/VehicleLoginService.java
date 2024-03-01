package com.example.vehicle.service;

import java.util.List;
import java.util.Optional;

// import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
// import org.springframework.data.domain.Sort.Direction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.vehicle.model.VehicleLogin;
import com.example.vehicle.repo.VehicleLoginRepo;

@Service
public class VehicleLoginService {
    @Autowired
    VehicleLoginRepo VehicleLoginRepo;

    public VehicleLogin addVehicleLogin(VehicleLogin vehicleLogin)
    {
        return VehicleLoginRepo.save(vehicleLogin);
    }
    public List<VehicleLogin> getVehicleLogin(int p,int s)
    {
        Pageable pageable=PageRequest.of(p,s,Sort.by(Sort.Direction.ASC, "username"));
        return VehicleLoginRepo.findAll(pageable).getContent();
    }
    public Optional<VehicleLogin> findUser(Long Id)
    {
        return VehicleLoginRepo.findById(Id);
    }
    public VehicleLogin editUser(Long Id,VehicleLogin vehicleLogin)
    {
        VehicleLogin vl=VehicleLoginRepo.findById(Id).orElse(null);
        if(vl!=null)
        {
            vl.setUsername(vehicleLogin.getUsername());
            vl.setEmail(vehicleLogin.getEmail());
            vl.setPassword(vehicleLogin.getPassword());
            vl.setCustomerphone(vehicleLogin.getCustomerphone());
            return VehicleLoginRepo.saveAndFlush(vl);
        }
        return null;
    }
    public String Delete(Long Id)
    {
        VehicleLoginRepo.deleteById(Id);
        return ("Deleted Succesfully");
    }
    public String DelAll()
    {
        VehicleLoginRepo.deleteAll();
        return "Deleted";
    }
}
