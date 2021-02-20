package Products;

import enums.DrumType;
import enums.InstrumentType;
import enums.MaterialType;
import interfaces.IPlay;
import interfaces.ISell;

public class Drum extends Instrument{
    private String name;
    private String brand;
    private InstrumentType instrumentType;
    private MaterialType materialType;
    private double buyingPrice;
    private double sellingPrice;
    private DrumType drumType;
    private int size;

    public Drum(String name, String brand, InstrumentType instrumentType, MaterialType materialType, DrumType drumType, int size, double buyingPrice, double sellingPrice) {
        super(name, brand, instrumentType, materialType, buyingPrice, sellingPrice);
        this.drumType = drumType;
        this.size = size;

    }

    public DrumType getDrumType() {
        return drumType;
    }

    public int getSize() {
        return size;
    }

    public String play() {
        return "CRA DIDDLYDUM!";
    }
    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
