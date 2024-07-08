import java.util.Scanner;

public class FoodCourtManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] menuItems = {"Burger", "Pizza", "Pasta", "Salad", "Soda"};
        double[] prices = {5.99, 8.99, 6.99, 4.99, 1.99};
        
        System.out.println("Welcome to the Food Court!");
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, menuItems[i], prices[i]);
        }

        System.out.println("\nEnter the number of the item you want to order (0 to finish):");
        double total = 0;
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            } else if (choice > 0 && choice <= menuItems.length) {
                total += prices[choice - 1];
                System.out.printf("Added %s to your order. Total so far: $%.2f%n", menuItems[choice - 1], total);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.printf("Thank you for your order! Your total bill is $%.2f%n", total);
        scanner.close();
    }
}
