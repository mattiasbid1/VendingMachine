package se.lexicon.data;

import se.lexicon.model.Product;

import java.util.concurrent.ExecutionException;

public class VendingMachineImpl implements VendingMachine {

    // fields

    private final Product[] products;
    public static final int[] CASHTYPES = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    public int depositPool;
    int currency = 0;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) {
        if (isProperCurrency(amount)) {
            depositPool = depositPool + amount;
        } else System.out.println("Please add a proper amount of cash!");

    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {

        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    return product;
                }
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int cashLeft = depositPool;
        depositPool = 0;
        return cashLeft;
    }

    @Override
    public String getDescription(int id) {
        String description = "No product with that id is availible.";
        for (Product product : products) {
            if (product.getId() == id) {
                description = product.examine();
            }
        }
        return description;
    }

    @Override
    public String[] getProducts() {
        String[] allProducts = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            allProducts[i] = products[i].examine();
        }

        return allProducts;
    }

    private boolean isProperCurrency(int money) {
        for (int i = 0; i < CASHTYPES.length; i++) {
            if (CASHTYPES[i] == money) return true;

        }
        return false;
    }
}
