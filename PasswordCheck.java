import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "secret";
        int attempts = 5;
        boolean accessGranted = false;

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter password: ");
            String userInput = input.nextLine();

            if (userInput.equals(correctPassword)) {
                System.out.println("Access granted.");
                accessGranted = true;
                break;
            } else {
                System.out.println("Wrong password. " + (attempts - i - 1) + " attempt(s) left.");
            }
        }

        if (!accessGranted) {
            System.out.println("Access denied. No attempts left.");
        }

        input.close();
    }
}
