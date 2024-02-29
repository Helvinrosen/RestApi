package com.example.vehicle.model;

// import java.util.ArrayList;
// import java.util.List;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ServiceBooking")
public class Vehicle 
{
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    
    Long   vehicleId;
    String customerPhNo;
    String vehicleType;
    String vehicleNumber;

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name="customer_id")
    // List<VehicleLogin> vehicle=new ArrayList<>();

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    

    public String getCustomerPhNo() {
        return customerPhNo;
    }

    public void setCustomerPhNo(String customerPhNo) {
        this.customerPhNo = customerPhNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    

    // public List<VehicleLogin> getVehicle() {
    //     return vehicle;
    // }

    // public void setVehicle(List<VehicleLogin> vehicle) {
    //     this.vehicle = vehicle;
    // }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    
}