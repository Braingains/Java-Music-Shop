import interfaces.ISell;

import java.util.ArrayList;

public class Shop{

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.till = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell product) {
        this.stock.add(product);
    }

    public void sell(ISell product) {
        this.stock.remove(product);
        this.till += product.getSellingPrice();
    }


    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }
}
