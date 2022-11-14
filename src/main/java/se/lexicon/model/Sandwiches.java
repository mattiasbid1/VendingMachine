package se.lexicon.model;

public class Sandwiches implements Product {

    /** The Sandwiches Products */

    //fields

    private int id;
    private String sandwichType;
    private double price;
    private final int kcal;
    private final String cheeseType;
    private int counter = 3000;

    public Sandwiches(String sandwichType, double price, int kcal, String cheeseType) {
        this.id = ++counter;
        this.sandwichType = sandwichType;
        this.price = price;
        this.kcal = kcal;
        this.cheeseType = cheeseType;
    }

    @Override
    public String examine() {

        return "Sandwich id: " + id + " Type of sandwich: " + sandwichType + " Type of cheese: " + cheeseType + " With " + kcal + "kcal and the price of: " + price;
    }

    @Override
    public String use() {
         return "You consumed some " + sandwichType + ", hope you enjoyed the " + cheeseType + "!";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductionName() {
        return sandwichType;
    }

    @Override
    public void setProductName(String type) {
        this.sandwichType = type;

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;

    }
}
