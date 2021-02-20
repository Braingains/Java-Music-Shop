import Products.Accessory;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory testGuitarPick;
    Accessory testDrumstick;

    @Before
    public void before() {
        testGuitarPick = new Accessory("Gibson Heavy Wedge", "Gibson", InstrumentType.GUITAR, 0.10, 1.50);
        testDrumstick = new Accessory("Vic Firth 5A Nylon tip", "Vic Firth", InstrumentType.DRUM, 4.00, 11.50);
    }

    @Test
    public void hasName() {
        assertEquals("Gibson Heavy Wedge", testGuitarPick.getName());
    }
    @Test
    public void hasBrand() {
        assertEquals("Gibson", testGuitarPick.getBrand());
    }
    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.DRUM, testDrumstick.getInstrumentType());
    }
    @Test
    public void hasBuyingPrice() {
        assertEquals(0.10, testGuitarPick.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(1.50, testGuitarPick.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice() {
        testDrumstick.setSellingPrice(12.50);
        assertEquals(12.50, testDrumstick.getSellingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(1.40, testGuitarPick.calculateMarkup(), 0.01);
    }
}
