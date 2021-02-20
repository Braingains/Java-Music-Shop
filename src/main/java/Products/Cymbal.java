package Products;

import enums.CymbalType;
import enums.InstrumentType;
import enums.MaterialType;

public class Cymbal extends Instrument{
    private String name;
    private String brand;
    private InstrumentType instrumentType;
    private MaterialType materialType;
    private double buyingPrice;
    private double sellingPrice;
    private CymbalType cymbalType;
    private int size;

    public Cymbal(String name, String brand, InstrumentType instrumentType, MaterialType materialType, CymbalType cymbalType, int size, double buyingPrice, double sellingPrice) {
        super(name, brand, instrumentType, materialType, buyingPrice, sellingPrice);
        this.cymbalType = cymbalType;
        this.size = size;

    }

    public CymbalType getCymbalType() {
        return cymbalType;
    }

    public int getSize() {
        return size;
    }

    public String play() {
        return "CCRRRSSHHHH!";
    }
    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}

