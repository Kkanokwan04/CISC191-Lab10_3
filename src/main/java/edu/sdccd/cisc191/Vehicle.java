package edu.sdccd.cisc191;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String manufacturerName;
    private int milesOnVehicle;
    private double price;
    private int numberOfSeats;

    public Vehicle() {}

    public Vehicle(String manufacturerName, int milesOnVehicle, double price, int numberOfSeats) {

        this.manufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;

    }

    public long getId() {
        return id;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setMilesOnVehicle(int milesOnVehicle) {
        this.milesOnVehicle = milesOnVehicle;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String toString() {
        return String.format("Vehicle [id=" + id + ", manufacturer= "+ manufacturerName + ", miles= " + milesOnVehicle +
                ", price= "+ price +", seats= "+ numberOfSeats + "]");
    }


}
