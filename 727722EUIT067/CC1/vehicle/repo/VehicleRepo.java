package com.example.vehicle.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vehicle.model.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle,Long>{

    
}