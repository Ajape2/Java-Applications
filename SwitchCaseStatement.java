import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int mark;
        String fullName;
        
        System.out.print("Enter your full name: ");
        fullName = input.nextLine();
        
        System.out.print("Enter your mark: ");
        mark = input.nextInt();
        
        switch (mark / 10) {
            case 10:
            case 9:
            case 8:
                System.out.printf("FullName: %s, Mark: %d - Your Grade is A%n", fullName, mark);
                break;
            case 7:
                System.out.printf("FullName: %s, Mark: %d - Your Grade is B%n", fullName, mark);
                break;
            case 6:
                System.out.printf("FullName: %s, Mark: %d - Your Grade is C%n", fullName, mark);
                break;
            case 5:
                System.out.printf("FullName: %s, Mark: %d - Your Grade is D%n", fullName, mark);
                break;
            case 4:
                System.out.printf("FullName: %s, Mark: %d - Your Grade is E%n", fullName, mark);
                break;
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.printf("FullName: %s, Mark: %d - Your Grade is F%n", fullName, mark);
                break;
            default:
                System.out.println("Invalid input");
        }
        
        input.close();
    }
}
