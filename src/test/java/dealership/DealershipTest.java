package dealership;

import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealershipTest {
    Dealership dealership;
    Engine engine;
    Tyres tyres;
    Car car1, car2, car3;
    ArrayList<Vehicle> vehicles;
    ArrayList<Vehicle> customerVehicles;
    Customer customer;




    @Before
    public void before(){
        engine = new Engine(2.0,400);
        tyres = new Tyres(4, "Goodyear");
        car1 = new Car(10000.00,"Silver", engine, tyres, VehicleType.HYBRID_CAR);
        car2 = new Car(10000.00,"Silver", engine, tyres, VehicleType.PETROL_CAR);
        car3 = new Car(10000.00,"Silver", engine, tyres, VehicleType.PETROL_CAR);
        vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        dealership = new Dealership(vehicles,200000);
        customer = new Customer("Stan",11000, customerVehicles );
    }

    @Test
    public void hasVehicles(){
        assertEquals(3, dealership.getVehicles().size());
    }

    @Test
    public void hasTill() {
        assertEquals(200000, dealership.getTill(), 0.01);
    }

    @Test
    public void hasStock() {
        assertEquals(2, dealership.getStock().size());
    }

    @Test
    public void getStockOfVehicleType() {
        assertEquals(2, dealership.getStock(VehicleType.PETROL_CAR));
    }

    @Test
    public void canAddVehicle() {
        Car car4 = new Car(10000.00,"Silver", engine, tyres, VehicleType.PETROL_CAR);
        dealership.addVehicle(car4);
        assertEquals(4, dealership.getVehicles().size());
    }

    @Test
    public void canRemoveVehicle() {
        dealership.removeVehicle(car1);
        assertEquals(2, dealership.getVehicles().size());
    }

    @Test
    public void canAddMoneyToTill() {
        dealership.addMoney(1000.00);
        assertEquals(201000, dealership.getTill(), 0.01);
    }

    @Test
    public void canRemoveMoneyFromTill() {
        dealership.removeMoney(100000.00);
        assertEquals(100000, dealership.getTill(), 0.01 );
    }
}
