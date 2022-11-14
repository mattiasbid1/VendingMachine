package se.lexicon.model;

public class Candy implements Product {

    /** The Candy Product */

    //fields

    private int id;
    private String candyType;
    private double price;
    private final int kcal;
    private final boolean hasPeanuts;
    private int counter = 1000;

    public Candy(String candyType, double price, int kcal, boolean hasPeanuts) {
        this.id = ++counter;
        this.candyType = candyType;
        this.price = price;
        this.kcal = kcal;
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String examine() {

        return "Candy id: " + id + " Type of candy: " + candyType + " Has peanuts: " + hasPeanuts + " With " + kcal + "kcal and the price of: " + price;
    }

    @Override
    public String use() {
        if(hasPeanuts) {
            return "You consumed some " + candyType + " so I hope you are not allergic to peanuts!";
        } else return "You consumed some " + candyType + ", hope it tasted good!";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductionName() {
        return candyType;
    }

    @Override
    public void setProductName(String type) {
        this.candyType = type;

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
