import java.util.*;

public class Main {

    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "[" + productId + ", " + productName + ", " + category + "]";
        }
    }

    static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) return i;
        }
        return -1;
    }
    static int binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) return mid;
            else if (products[mid].productId < targetId) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    static void sortById(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    }

    public static void main(String[] args) {
        Product[] catalog = {
                new Product(105, "Keyboard", "Electronics"),
                new Product(201, "Running Shoes", "Sports"),
                new Product(305, "Coffee Mug", "Kitchen"),
                new Product(409, "Backpack", "Accessories"),
                new Product(512, "Smartphone", "Electronics")
        };

        System.out.println("Product Catalog:");
        for (Product p : catalog) System.out.println(p);

        // Linear Search
        int linearResult = linearSearch(catalog, 409);
        System.out.println("\nLinear Search Result: " + (linearResult != -1 ? catalog[linearResult] : "Not found"));

        sortById(catalog);

        //Binary Search
        int binaryResult = binarySearch(catalog, 409);
        System.out.println("Binary Search Result: " + (binaryResult != -1 ? catalog[binaryResult] : "Not found"));
    }
}
