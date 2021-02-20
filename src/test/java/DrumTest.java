import Products.Drum;
import enums.DrumType;
import enums.InstrumentType;
import enums.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum testDrum;

    @Before
    public void before() {
        testDrum = new Drum ("Black Beauty", "Ludwig", InstrumentType.DRUM, MaterialType.OAK, DrumType.SNARE, 14, 400, 850);

    }

    @Test
    public void hasName() {
        assertEquals("Black Beauty", testDrum.getName());
    }
    @Test
    public void hasBrand() {
        assertEquals("Ludwig", testDrum.getBrand());
    }
    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.DRUM, testDrum.getInstrumentType());
    }
    @Test
    public void hasMaterialType() {
        assertEquals(MaterialType.OAK, testDrum.getMaterialType());
    }
    @Test
    public void hasDrumType() {
        assertEquals(DrumType.SNARE, testDrum.getDrumType());
    }
    @Test
    public void hasSize() {
        assertEquals(14, testDrum.getSize());
    }
    @Test
    public void hasBuyingPrice() {
        assertEquals(400, testDrum.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(850, testDrum.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice() {
        testDrum.setSellingPrice(750);
        assertEquals(750, testDrum.getSellingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(450, testDrum.calculateMarkup(), 0.01);
    }
    @Test
    public void canPlay() {
        assertEquals("CRA DIDDLYDUM!", testDrum.play());
    }

}
