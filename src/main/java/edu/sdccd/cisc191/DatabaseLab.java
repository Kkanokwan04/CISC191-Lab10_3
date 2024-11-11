package edu.sdccd.cisc191;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseLab {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLab.class);

    public static void main(String[] args) {
        SpringApplication.run(DatabaseLab.class, args);
    }

    @Bean
    public CommandLineRunner demo(VehicleRepository repository) {
        return (args) -> {
            // Saving example vehicles
            repository.save(new Vehicle("Toyota", 50000, 15000, 5));
            repository.save(new Vehicle("Honda", 30000, 18000, 4));
            repository.save(new Vehicle("Tesla", 0, 60000, 4));

            // Fetching all vehicles
            log.info("Vehicles found with findAll():");
            for (Vehicle vehicle : repository.findAll()) {
                log.info(vehicle.toString());
            }

            // Fetching a specific vehicle by ID
            Vehicle vehicle = repository.findById(1L);
            if (vehicle != null) {
                log.info("Vehicle found with findById(1L): {}", vehicle);
            }

            // Fetching vehicles by manufacturer
            log.info("Vehicles found with findByManufacturerName('Honda'):");
            repository.findByMenufacturerName("Honda").forEach(honda -> log.info(honda.toString()));
        };
    }
}
