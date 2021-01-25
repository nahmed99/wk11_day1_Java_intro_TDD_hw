import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    // Run the method below, before each test case
    // that follows...to reset the noOfSheets value.
    @Before
    public void before() {
        printer = new Printer(500, 1000);
    }


    @Test
    public void hasPaper() {
        // Expected value, actual value
        assertEquals(500, printer.getNoOfSheets());
    }

    @Test
    public void printsTrue() {
        // check that printer copies when it has sufficient paper
        assertEquals(true, printer.print(15, 3));

        // number of sheets left AFTER printing
        assertEquals(455, printer.getNoOfSheets());
    }

    @Test
    public void printsFalse() {
        // check that printer does not copy when insufficient paper
        assertEquals(false, printer.print(250, 3));

        // number of remaining sheets is unchanged, as printing didn't take place
        assertEquals(500, printer.getNoOfSheets());
    }

    @Test
    public void reducesTonerVolume() {
        // Print copies and then check that toner volume is reduced
        assertEquals(true, printer.print(25, 10));
        assertEquals(750, printer.getTonerVolume());
    }
}
