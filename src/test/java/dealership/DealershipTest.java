package dealership;

import org.junit.Before;
import org.junit.Test;
import vehicles.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealershipTest {
    Dealership dealership;
    Engine engine;
    Tyres tyres;
    Car car1, car2, car3;
    ArrayList<Vehicle> vehicles;



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
}
