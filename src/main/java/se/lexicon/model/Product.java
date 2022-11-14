package se.lexicon.model;

public interface Product {

    //fields

    // methods

    String examine();

    String use();

    int getId();

    String getProductionName();

    void setProductName(String type);

    double getPrice();

    void setPrice(double price);
}
