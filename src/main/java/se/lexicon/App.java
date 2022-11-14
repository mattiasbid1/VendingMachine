package se.lexicon;

import se.lexicon.data.*;
import se.lexicon.model.*;

/**
 * Vending machine
 */
public class App {
    public static void main(String[] args) {

        // adding some sample products
        Product[] products = {new Candy("Snickers", 15, 225, true),
                new Candy("Daim", 10, 135, false),
                new Candy("Cheez doodles", 25, 380, false),
                new Drinks("Coca cola", 22, 82, true),
                new Drinks("Mer", 12, 55, false),
                new Sandwiches("Vanlig baguette", 38, 112, "Kvibille mild"),
                new Sandwiches("Starkostsbaguette", 41, 118, "Gorgonzola")};

        VendingMachine vendingMachine = new VendingMachineImpl(products);

        System.out.println("The virtual Vending Machine!");

        vendingMachine.addCurrency(100);
        System.out.println(vendingMachine.getBalance() + "kr left to spend");
        for (String currentProduct : vendingMachine.getProducts()) {
            System.out.println(currentProduct);
        }
        Product boughtProduct = vendingMachine.request(1001);
        System.out.println("You bought a " + boughtProduct.getProductionName());
        System.out.println(boughtProduct.use());
        boughtProduct = vendingMachine.request(3001);
        System.out.println("You bought a " + boughtProduct.getProductionName());
        System.out.println(boughtProduct.use());
        System.out.println("You got " + vendingMachine.endSession() + "kr back and walked away.");

    }
}
