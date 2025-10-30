import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {

        // Scanner object has been created
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int mark;
        String fullname;

        // Prompt user for input
        System.out.print("Enter your full name: ");
        fullname = input.nextLine();

        System.out.print("Enter your mark: ");
        mark = input.nextInt();

        if (mark >= 80) {
            System.out.printf("FullName: %s, Mark: %d — Your grade is A%n", fullname, mark);
        } else if (mark >= 75) {
            System.out.printf("FullName: %s, Mark: %d — Your grade is B%n", fullname, mark);
        } else if (mark >= 65) {
            System.out.printf("FullName: %s, Mark: %d — Your grade is C%n", fullname, mark);
        } else if (mark >= 55) {
            System.out.printf("FullName: %s, Mark: %d — Your grade is D%n", fullname, mark);
        } else if (mark >= 45) {
            System.out.printf("FullName: %s, Mark: %d — Your grade is E%n", fullname, mark);
        } else {
            System.out.printf("FullName: %s, Mark: %d — Your grade is F%n", fullname, mark);
        }
    }
}
