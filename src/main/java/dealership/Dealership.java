package dealership;

import people.Customer;
import vehicles.Car;
import vehicles.Vehicle;
import vehicles.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;

public class Dealership {
    private ArrayList<Vehicle> vehicles;
    private double till;
    private HashMap<VehicleType, Integer> stock;

    public Dealership(ArrayList<Vehicle> vehicles, double till) {
        this.vehicles = vehicles;
        this.till = till;
        this.stock = getStock();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public HashMap<VehicleType, Integer> getStock(){
        HashMap<VehicleType, Integer> stock = new HashMap();
        for (Vehicle vehicle : getVehicles()){
            stock.merge(vehicle.getVehicleType(), 1, Integer::sum);
        }
        return stock;

    }

    public int getStock(VehicleType vehicleType) {
        return this.stock.get(vehicleType);
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public void addMoney(Double amount) {
        this.till += amount;
    }

    public void removeMoney(double amount) {
        this.till -= amount;

    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        customer.removeMoney(vehicle.getSellPrice());
        addMoney(vehicle.getSellPrice());
        removeVehicle(vehicle);
        customer.addVehicle(vehicle);
    }

    public void repairVehicle(Vehicle vehicle, double repair) {
        if (vehicle.getDamageCost() >= repair){
            vehicle.repairDamage(repair);
            removeMoney(repair);
        }
    }
}
