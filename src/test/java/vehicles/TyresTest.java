package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TyresTest {
    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(4, "Goodyear");
    }

    @Test
    public void hasNumberOfTyres() {
        assertEquals(4, tyres.getNumberOfTyres());
    }

    @Test
    public void hasBrand() {
        assertEquals("Goodyear", tyres.getBrand());
    }
}
