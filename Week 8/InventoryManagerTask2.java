import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagerTask2 {
    
      private static HashMap<String, Integer> inventory = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Populating Initial Data
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 40);

        while (true) {
            System.out.println("\n--- INVENTORY MANAGEMENT MENU ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Remove Stock");
            System.out.println("3. Check Stock Level");
            System.out.println("4. Display All Products");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStock();
                    break;
                case 2:
                    removeStock();
                    break;
                case 3:
                    checkStock();
                    break;
                case 4:
                    displayAllProducts();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }

    // To Add Stock
    public static void addStock() {
        System.out.print("Enter product name to add stock: ");
        String product = scanner.nextLine();
        System.out.print("Enter quantity to add: ");
        int quantity = scanner.nextInt();

        inventory.put(product, inventory.getOrDefault(product, 0) + quantity);
        System.out.println("Successfully added stock. Updated total for " + product + ": " + inventory.get(product));
    }

    // To Remove Stock
    public static void removeStock() {
        System.out.print("Enter product name to remove stock: ");
        String product = scanner.nextLine();

        if (!inventory.containsKey(product)) {
            System.out.println("Error: Product '" + product + "' does not exist in inventory.");
            return;
        }

        System.out.print("Enter quantity to remove: ");
        int quantity = scanner.nextInt();
        int currentStock = inventory.get(product);

        if (quantity > currentStock) {
            System.out.println("Error: Cannot remove " + quantity + " units. Only " + currentStock + " available.");
        } else {
            inventory.put(product, currentStock - quantity);
            System.out.println("Successfully removed stock. Remaining " + product + ": " + inventory.get(product));
        }
    }

    // To Check Stock Level
    public static void checkStock() {
        System.out.print("Enter product name to check: ");
        String product = scanner.nextLine();

        if (inventory.containsKey(product)) {
            System.out.println("Stock Level for " + product + ": " + inventory.get(product) + " units.");
        } else {
            System.out.println("Product '" + product + "' is not found in the inventory.");
        }
    }

    // To Display All Products
    public static void displayAllProducts() {
        System.out.println("\n--- Current Inventory Status ---");
        if (inventory.isEmpty()) {
            System.out.println("Inventory is completely empty.");
            return;
        }
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}