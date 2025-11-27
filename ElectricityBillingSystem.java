import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// ===========================
// ENUM FOR CUSTOMER TYPE
// ===========================
enum CustomerType {
    REGULAR,
    BUSINESS,
    VIP
}

// ===========================
// CUSTOMER CLASS
// ===========================
class Customer {
    String name;
    int units;
    CustomerType type;

    Customer(String name, int units, CustomerType type) {
        this.name = name;
        this.units = units;
        this.type = type;
    }
}

// ===========================
// BILLING SERVICE CLASS
// ===========================
class BillingService {

    // Colors for console output
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    // Calculate bill based on 50-unit blocks
    public double calculateBill(int units, CustomerType type) {
        double total = 0;
        int remaining = units;

        int blockNumber = 1;

        System.out.println("\n" + BLUE + "--- BILL BREAKDOWN ---" + RESET);

        while (remaining > 0) {

            int used = Math.min(50, remaining);
            double rate = getRate(remaining);
            double cost = used * rate;

            System.out.println(
                "Block " + blockNumber + ": " + used + 
                " units @ ₦" + rate + " = ₦" + cost
            );

            total += cost;

            remaining -= used;
            blockNumber++;
        }

        // Apply discount
        if (type == CustomerType.BUSINESS) {
            total -= total * 0.05;
        } else if (type == CustomerType.VIP) {
            total -= total * 0.10;
        }

        return total;
    }

    // Price per unit based on remaining units
    private double getRate(int units) {
        if (units <= 100) {
            return 30;
        } else if (units <= 300) {
            return 25;
        } else {
            return 20;
        }
    }
}

// ===========================
// MAIN CLASS WITH MENU
// ===========================
public class ElectricityBillingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BillingService service = new BillingService();
        ArrayList<Customer> customers = new ArrayList<>();

        while (true) {
            System.out.println("\n===== ELECTRICITY BILLING MENU =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Print Bills");
            System.out.println("3. Save Bills to File");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                case 1: // Add customer
                    System.out.print("Enter customer name: ");
                    String name = input.nextLine();

                    System.out.print("Enter units consumed: ");
                    int units = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter type (REGULAR, BUSINESS, VIP): ");
                    String typeStr = input.nextLine().toUpperCase();
                    CustomerType type = CustomerType.valueOf(typeStr);

                    customers.add(new Customer(name, units, type));
                    System.out.println("Customer added successfully!");
                    break;

                case 2: // Print bills
                    for (Customer c : customers) {
                        System.out.println("\n----------------------------");
                        System.out.println("Customer: " + c.name);
                        System.out.println("Type: " + c.type);
                        System.out.println("Units: " + c.units);

                        double bill = service.calculateBill(c.units, c.type);

                        System.out.println(BillingService.GREEN + 
                            "TOTAL BILL: ₦" + bill + 
                            BillingService.RESET);
                    }
                    break;

                case 3: // Save to file
                    saveBillsToFile(customers, service);
                    break;

                case 4: // Exit
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    // METHOD TO SAVE BILLS TO FILE
    public static void saveBillsToFile(ArrayList<Customer> customers, BillingService service) {
        try {
            FileWriter writer = new FileWriter("bills.txt");

            for (Customer c : customers) {
                double bill = service.calculateBill(c.units, c.type);
                writer.write("Customer: " + c.name + "\n");
                writer.write("Type: " + c.type + "\n");
                writer.write("Units: " + c.units + "\n");
                writer.write("Total Bill: ₦" + bill + "\n");
                writer.write("---------------------------\n");
            }

            writer.close();
            System.out.println("Bills saved to bills.txt!");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}
