package ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EcommerceSearch {

    // Product class as an inner static class
    static class Product {
        int id;
        String name;
        double price;

        Product(int id, String name, double price) {
            this.id = id;
            this.name = name.toLowerCase(); // for case-insensitive search
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product ID: " + id + ", Name: " + name + ", Price: ₹" + price;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iPhone 14", 79999));
        products.add(new Product(2, "Samsung Galaxy S21", 69999));
        products.add(new Product(3, "Sony Headphones", 8999));
        products.add(new Product(4, "Apple Watch", 29999));
        products.add(new Product(5, "iPhone Case", 999));

        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        // Search logic
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.name.contains(keyword)) {
                results.add(p);
            }
        }

        // Output results
        if (results.isEmpty()) {
            System.out.println("No products found matching '" + keyword + "'.");
        } else {
            System.out.println("Search results:");
            for (Product p : results) {
                System.out.println(p);
            }
        }

        scanner.close();
    }
}
