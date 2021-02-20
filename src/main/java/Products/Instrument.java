package Products;

import enums.InstrumentType;
import enums.MaterialType;
import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String name;
    private String brand;
    private InstrumentType instrumentType;
    private MaterialType materialType;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String name, String brand, InstrumentType instrumentType, MaterialType materialType, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.brand = brand;
        this.instrumentType = instrumentType;
        this.materialType = materialType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public abstract String play();

    public abstract double calculateMarkup();
}
