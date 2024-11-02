/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public class Truck extends Vehicle {

    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency,
            double cargoCapacity) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (cargoCapacity / 1000.0)));
    }

    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    public double getMaxSpeed() {
        return 80.0;
    }
}
