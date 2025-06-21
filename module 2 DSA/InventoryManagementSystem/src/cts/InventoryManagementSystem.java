package cts;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update a product in the inventory
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Delete a product from the inventory
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Display the inventory
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products
        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 20, 499.99);
        ims.addProduct(product1);
        ims.addProduct(product2);

        // Displaying inventory
        System.out.println("Inventory after adding products:");
        ims.displayInventory();

        // Updating a product
        product1.setPrice(899.99);
        ims.updateProduct(product1);

        // Displaying inventory after update
        System.out.println("\nInventory after updating product 1:");
        ims.displayInventory();

        // Deleting a product
        ims.deleteProduct("2");

        // Displaying inventory after deletion
        System.out.println("\nInventory after deleting product 2:");
        ims.displayInventory();
    }
}

