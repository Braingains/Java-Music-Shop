import Products.Cymbal;
import enums.CymbalType;
import enums.InstrumentType;
import enums.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CymbalTest {

    Cymbal testCymbal;

    @Before
    public void before() {
        testCymbal = new Cymbal("A Custom 16 Crash", "Zildjian", InstrumentType.CYMBAL, MaterialType.B20, CymbalType.CRASH, 16, 100, 160);

    }

    @Test
    public void hasName() {
        assertEquals("A Custom 16 Crash", testCymbal.getName());
    }
    @Test
    public void hasBrand() {
        assertEquals("Zildjian", testCymbal.getBrand());
    }
    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.CYMBAL, testCymbal.getInstrumentType());
    }
    @Test
    public void hasMaterialType() {
        assertEquals(MaterialType.B20, testCymbal.getMaterialType());
    }
    @Test
    public void hasCymbalType() {
        assertEquals(CymbalType.CRASH, testCymbal.getCymbalType());
    }
    @Test
    public void hasSize() {
        assertEquals(16, testCymbal.getSize());
    }
    @Test
    public void hasBuyingPrice() {
        assertEquals(100, testCymbal.getBuyingPrice(), 0.01);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(160, testCymbal.getSellingPrice(), 0.01);
    }
    @Test
    public void canSetSellingPrice() {
        testCymbal.setSellingPrice(150);
        assertEquals(150, testCymbal.getSellingPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(60, testCymbal.calculateMarkup(), 0.01);
    }
    @Test
    public void canPlay() {
        assertEquals("CCRRRSSHHHH!", testCymbal.play());
    }

}
