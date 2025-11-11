import java.util.Scanner;

public class UsingMathClass {
    public static void main(String[] args) {
        Scanner inputn = new Scanner(System.in);

        System.out.print("Enter any negative number of your choice: ");
        int num1 = inputn.nextInt();

        System.out.print("Enter another negative number of your choice: ");
        int num2 = inputn.nextInt();

        System.out.print("Enter any number to find the square root: ");
        int squareRootNum = inputn.nextInt();

        int castedSquareRootNum = (int) Math.sqrt(squareRootNum);

        // Output
        System.out.printf("The absolute values are: %d and %d%n", Math.abs(num1), Math.abs(num2));
        System.out.printf("The maximum number is: %d%n", Math.max(num1, num2));
        System.out.printf("The minimum number is: %d%n", Math.min(num1, num2));
        System.out.printf("The square root (rounded) is: %d%n", castedSquareRootNum);
        System.out.printf("The answer is: %f%n", Math.pow(num1, 2) * Math.pow(num2, 2));

        inputn.close();
    }
}
