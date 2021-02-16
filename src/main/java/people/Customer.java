package people;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double money, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.money = money;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public void removeMoney(double amount) {
        this.money -= amount;
    }

    public void addMoney(double amount) {
        this.money += amount;
    }
}
