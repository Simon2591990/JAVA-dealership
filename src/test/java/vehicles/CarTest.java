package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine(2.0,400);
        tyres = new Tyres(4, "Goodyear");
        car = new Car(10000.00,"Silver", engine, tyres, VehicleType.HYBRID_CAR);
    }

    @Test
    public void hasPrice() {
        assertEquals(10000.00, car.getPrice(), 0.01);
    }

    @Test
    public void hasColor() {
        assertEquals("Silver", car.getColor());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasVehicleType() {
        assertEquals(VehicleType.HYBRID_CAR, car.getVehicleType());
    }
}
