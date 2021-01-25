import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    // Run the method below, before each individual test case
    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void canGetVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canSetvolume() {
        waterBottle.setVolume(95);
        assertEquals(95, waterBottle.getVolume());
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrink() {
        waterBottle.drink();
        // Expected value, actual value
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill() {
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }




}
