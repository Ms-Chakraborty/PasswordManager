
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("🔐 Welcome to Secure Password Manager 🔐");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Credential");
            System.out.println("2. View Credential");
            System.out.println("3. Update Credential");
            System.out.println("4. Remove Credential");
            System.out.println("5. List All Services");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Make sure we get an integer
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    manager.addCredential(service, password);
                }
                case 2 -> {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    manager.getCredential(service);
                }
                case 3 -> {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine();
                    manager.updateCredential(service, newPassword);
                }
                case 4 -> {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    manager.removeCredential(service);
                }
                case 5 -> manager.listCredentials();
                case 0 -> System.out.println("Goodbye! 👋");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

