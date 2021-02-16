package people;

import org.junit.Before;
import org.junit.Test;
import vehicles.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    ArrayList<Vehicle> vehicles;


    @Before
    public void before(){
        vehicles = new ArrayList<Vehicle>();
        customer = new Customer("Stan",10000, vehicles );
    }

    @Test
    public void hasName() {
        assertEquals("Stan", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(10000, customer.getMoney(), 0.01);
    }

    @Test
    public void hasArrayOfVehicles() {
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void canAddVehicle() {
        Engine engine = new Engine(2.0,400);
        Tyres tyres = new Tyres(4, "Goodyear");
        Car car4 = new Car(10000.00,"Silver", engine, tyres, VehicleType.PETROL_CAR);
        customer.addVehicle(car4);
        assertEquals(1, customer.getVehicles().size());

    }

    @Test
    public void canRemoveVehicle() {
        Engine engine = new Engine(2.0,400);
        Tyres tyres = new Tyres(4, "Goodyear");
        Car car4 = new Car(10000.00,"Silver", engine, tyres, VehicleType.PETROL_CAR);
        customer.addVehicle(car4);
        customer.addVehicle(car4);
        customer.removeVehicle(car4);
        assertEquals(1, customer.getVehicles().size());

    }

    @Test
    public void canRemoveMoney(){
        customer.removeMoney(1000.00);
        assertEquals(9000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void canAddMoney(){
        customer.addMoney(500.00);
        assertEquals(10500.00, customer.getMoney(), 0.01);
    }
}
