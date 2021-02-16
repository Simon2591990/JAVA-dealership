package people;

import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

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

}
