import java.util.Scanner;

public class MethodOverLoading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            // Menu
            System.out.println("=======================================");
            System.out.println("Calculating perimeter of different shapes");
            System.out.println("=======================================");
            System.out.println("Enter 1: for Square");
            System.out.println("Enter 2: for Rectangle");
            System.out.println("Enter 3: for Triangle");
            System.out.println("Enter 4: Exit");
            System.out.print("Enter your option: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the length of the square: ");
                    int sqLength = input.nextInt();
                    perimeter(sqLength);
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    int rectLength = input.nextInt();
                    System.out.print("Enter the height of the rectangle: ");
                    int rectHeight = input.nextInt();
                    perimeter(rectLength, rectHeight);
                    break;

                case 3:
                    System.out.print("Enter side1 of the triangle: ");
                    int tSide1 = input.nextInt();
                    System.out.print("Enter side2 of the triangle: ");
                    int tSide2 = input.nextInt();
                    System.out.print("Enter side3 (base) of the triangle: ");
                    int tSide3 = input.nextInt();
                    perimeter(tSide1, tSide2, tSide3);
                    break;

                case 4:
                    System.out.println("Exiting program, goodbye .....");
					return;
                    // If user chose exit, set choice to 'N' so the loop ends (or just break out of do/while)
       
                     // end program immediately
                default:
                    System.out.println("Invalid Input");
                    
            }

            // ask if they want to run the program again
            System.out.print("Do you want to run the program again (Y/N)? ");
            choice = input.next().charAt(0); // read first character of next token

        } while (choice == 'Y' || choice == 'y');

        input.close();
        System.out.println("Program terminated. Goodbye!");
    }

    // perimeter for square
    public static void perimeter(int a) {
        int per = 4 * a;
        System.out.println();
        System.out.println("========================================");
        System.out.printf("The perimeter of the square is %d%n", per);
    }

    // perimeter for rectangle
    public static void perimeter(int a, int b) {
        int per = 2 * (a + b);
        System.out.println();
        System.out.println("========================================");
        System.out.printf("The perimeter of the rectangle is %d%n", per);
    }

    // perimeter for triangle
    public static void perimeter(int a, int b, int c) {
        int per = a + b + c;
        System.out.println();
        System.out.println("========================================");
        System.out.printf("The perimeter of the triangle is %d%n", per);
    }
}
