import java.util.Scanner;

// 1. Create the enum for customer types
enum CustomerType {
    REGULAR,
    BUSINESS,
    VIP
}

public class ElectricityBill {

    // 2. Static method to calculate total bill
    public static double calculateBill(int units, CustomerType type) {

        // Step A: Decide price per unit
        double pricePerUnit;

        if (units <= 100) {
            pricePerUnit = 30;
        } else if (units <= 300) {
            pricePerUnit = 25;
        } else {
            pricePerUnit = 20;
        }

        // Step B: Calculate basic bill
        double total = units * pricePerUnit;

        // Step C: Apply discount based on customer type
        if (type == CustomerType.BUSINESS) {
            total = total - (total * 0.05);   // 5% discount
        } else if (type == CustomerType.VIP) {
            total = total - (total * 0.10);   // 10% discount
        }
        // REGULAR has no discount

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 3. Asking for customer information
        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter units consumed: ");
        int units = input.nextInt();

        System.out.print("Enter customer type (REGULAR, BUSINESS, VIP): ");
        String typeInput = input.next().toUpperCase();
        CustomerType type = CustomerType.valueOf(typeInput);

        // 4. Display breakdown for each 50 units using a loop
        System.out.println("\n--- BILL BREAKDOWN (Per 50 Units) ---");
        int remaining = units;
        int block = 1;

        while (remaining > 0) {
            int used = Math.min(50, remaining);  // use 50 or what's left
            System.out.println("Block " + block + ": " + used + " units");
            remaining -= used;
            block++;
        }

        // 5. Calculate final total bill
        double finalBill = calculateBill(units, type);

        // 6. Print final result
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Customer Type: " + type);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: ₦" + finalBill);
    }
}
