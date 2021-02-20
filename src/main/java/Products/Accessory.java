package Products;

import enums.InstrumentType;
import interfaces.ISell;

public class Accessory implements ISell {
    private String name;
    private String brand;
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;

    public Accessory(String name, String brand, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        this.name = name;
        this.brand = brand;
        this.instrumentType = instrumentType;
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

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return getSellingPrice() - getBuyingPrice();
    }
}
