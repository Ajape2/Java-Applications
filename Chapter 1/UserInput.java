mport java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your firstname: ");
        String firstName = input.nextLine();

        System.out.printf("Hello %s", firstName);
		
		System.out.print("Enter lastname:");
		String lastName = input.nextLine():;
		
		System.out.printf("welcome%s % to firstBank",firstname,lastname);
    }
}







