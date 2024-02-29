package com.example.vehicle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vehicle.model.VehicleLogin;

@Repository
public interface VehicleLoginRepo extends JpaRepository<VehicleLogin,Long>{

    
}