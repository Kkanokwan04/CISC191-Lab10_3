package edu.sdccd.cisc191;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    List<Vehicle> findByMenufacturerName(String manufacturerName);
    Vehicle findById(long id);
    List<Vehicle> findByNumberOfSeats(int numberOfSeats);


}