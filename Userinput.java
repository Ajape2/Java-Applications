import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your firstname: ");
        String firstName = input.nextLine();
		
		double bal =5678.98;

        System.out.print("Enter lastname:");
		String lastName = input.nextLine();
		
		System.out.print("Enter your age:");
		Short age = input.nextShort();
		
		System.out.printf("welcome %s %s to firstBank%n",firstName,lastName);
		System.out.printf("your are %d years old%n", age);
		System.out.printf("your account balance is $%.2f%n",bal);
		
    }
}