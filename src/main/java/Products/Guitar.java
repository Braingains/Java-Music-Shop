package Products;

import enums.CymbalType;
import enums.InstrumentType;
import enums.MaterialType;

public class Guitar extends Instrument{
    private String name;
    private String brand;
    private InstrumentType instrumentType;
    private MaterialType materialType;
    private double buyingPrice;
    private double sellingPrice;
    private int strings;
    private int pickups;

    public Guitar(String name, String brand, InstrumentType instrumentType, MaterialType materialType, int strings, int pickups, double buyingPrice, double sellingPrice) {
        super(name, brand, instrumentType, materialType, buyingPrice, sellingPrice);
        this.strings = strings;
        this.pickups = pickups;
    }

    public int getStrings() {
        return strings;
    }

    public int getPickups() {
        return pickups;
    }

    public String play() {
        if (getInstrumentType() == InstrumentType.BASSGUITAR){
            return "BRBR DENG";
        }
        else {
            return "No Stairway - DENIED!";
        }
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
