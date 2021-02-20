import Products.Accessory;
import Products.Cymbal;
import Products.Drum;
import Products.Guitar;
import enums.CymbalType;
import enums.DrumType;
import enums.InstrumentType;
import enums.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop testShop;
    private Guitar testGuitar;
    private Drum testDrum;
    private Cymbal testCymbal;
    private Accessory testGuitarPick;
    private Accessory testDrumstick;

    @Before()
    public void before(){
        testShop = new Shop ("Ewan's RockHaus");
        testGuitar = new Guitar ("Les Paul Custom", "Gibson", InstrumentType.GUITAR, MaterialType.MAPLE, 6, 2, 3000, 4000);
        testDrum = new Drum ("Black Beauty", "Ludwig", InstrumentType.DRUM, MaterialType.OAK, DrumType.SNARE, 14, 400, 850);
        testCymbal = new Cymbal("A Custom 16 Crash", "Zildjian", InstrumentType.CYMBAL, MaterialType.B20, CymbalType.CRASH, 16, 100, 160);
        testGuitarPick = new Accessory("Gibson Heavy Wedge", "Gibson", InstrumentType.GUITAR, 0.10, 1.50);
        testDrumstick = new Accessory("Vic Firth 5A Nylon tip", "Vic Firth", InstrumentType.DRUM, 4.00, 11.50);

    }

    @Test
    public void hasName() {
        assertEquals("Ewan's RockHaus", testShop.getName());
    }
    @Test
    public void hasTill(){
        assertEquals(0, testShop.getTill(), 0.01);
    }
    @Test
    public void canAddToStock() {
        testShop.addToStock(testGuitar);
        assertEquals(1, testShop.getStock().size());
    }
    @Test
    public void canAddToStock2() {
        testShop.addToStock(testGuitar);
        testShop.addToStock(testDrum);
        testShop.addToStock(testCymbal);
        assertEquals(3, testShop.getStock().size());

    }
    @Test
    public void canSellProduct() {
        testShop.addToStock(testGuitar);
        testShop.addToStock(testDrum);
        testShop.addToStock(testCymbal);
        testShop.sell(testCymbal);
        assertEquals(2, testShop.getStock().size());
        assertEquals(160, testShop.getTill(), 0.01);
    }

}
