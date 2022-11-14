package se.lexicon.model;

public class Drinks implements Product {


    /** The Drinks Product */

    //fields

    private int id;
    private String drinksType;
    private double price;
    private final int kcal;
    private final boolean isCarbonated;
    private int counter = 2000;

    public Drinks(String drinksType, double price, int kcal, boolean isCarbonated) {
        this.id = ++counter;
        this.drinksType = drinksType;
        this.price = price;
        this.kcal = kcal;
        this.isCarbonated = isCarbonated;
    }

    @Override
    public String examine() {

        return "Drink id: " + id + " Type of drink: " + drinksType + " Is carbonated: " + isCarbonated + " With " + kcal + "kcal and the price of: " + price;
    }

    @Override
    public String use() {
        if(isCarbonated) {
            return "You consumed some " + drinksType + " and it fizzles and sizzles!";
        } else return "You consumed some " + drinksType + ", hope it tasted good!";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductionName() {
        return drinksType;
    }

    @Override
    public void setProductName(String type) {
        this.drinksType = type;

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
