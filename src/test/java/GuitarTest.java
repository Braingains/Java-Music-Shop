import Products.Drum;
import Products.Guitar;
import enums.DrumType;
import enums.InstrumentType;
import enums.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar testGuitar;
    Guitar testBass;

    @Before
    public void before() {
        testGuitar = new Guitar ("Les Paul Custom", "Gibson", InstrumentType.GUITAR, MaterialType.MAPLE, 6, 2, 3000, 4000);
        testBass = new Guitar ("Musicman", "Gibson", InstrumentType.BASSGUITAR, MaterialType.MAPLE, 4, 2, 800, 1600);

    }

    @Test
    public void hasName() {
        assertEquals("Les Paul Custom", testGuitar.getName());
    }
    @Test
    public void hasBrand() {
        assertEquals("Gibson", testGuitar.getBrand());
    }
    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.GUITAR, testGuitar.getInstrumentType());
    }
    @Test
    public void hasMaterialType() {
        assertEquals(MaterialType.MAPLE, testGuitar.getMaterialType());
    }
    @Test
    public void hasNumberOfString() {
        assertEquals(6, testGuitar.getStrings());
    }
    @Test
    public void hasNumberOfPickups() {
        assertEquals(2, testGuitar.getPickups());
    }
    @Test
    public void hasBuyingPrice() {
        assertEquals(3000, testGuitar.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(4000, testGuitar.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice() {
        testGuitar.setSellingPrice(3500);
        assertEquals(3500, testGuitar.getSellingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(1000, testGuitar.calculateMarkup(), 0.01);
    }
    @Test
    public void canPlayGuitar() {
        assertEquals("No Stairway - DENIED!", testGuitar.play());
    }
    @Test
    public void canPlayBass() {assertEquals("BRBR DENG", testBass.play());}
}
