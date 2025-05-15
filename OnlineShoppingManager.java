/*
 * 5. Develop an online shopping platform to manage a dynamic list of products available for sale.
i. Implement a program called OnlineShoppingManager that uses a Vector to store product
objects. Each product should have attributes for name, price and category.
ii. Design methods in the OnlineShoppingManager class to add products to the inventory,
remove products from the inventory and display all products in the inventory.
*/

import java.util.Vector;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class OnlineShoppingManager {
    private Vector<Product> inventory;

    public OnlineShoppingManager() {
        inventory = new Vector<>();
    }

    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                System.out.println("Removed product: " + name);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    public void displayInventory() {
        System.out.println("\nInventory:");
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product product : inventory) {
                System.out.println("Name: " + product.name +
                                   ", Price: ₹" + product.price +
                                   ", Category: " + product.category);
            }
        }
    }

    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();

        // Add some products to the inventory
        manager.addProduct("Laptop", 40000, "Electronics");
        manager.addProduct("T-shirt", 550, "Clothing");
        manager.addProduct("Book", 920, "Books");

        // Display all products
        manager.displayInventory();

        // Remove a product and display updated inventory
        manager.removeProduct("Book");
        manager.displayInventory();

        manager.removeProduct("Laptop");
        manager.displayInventory();

        manager.removeProduct("Phone"); // Non-existent product test
    }
}
