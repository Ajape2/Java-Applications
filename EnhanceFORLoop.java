import java.util.Scanner;

public class EnhanceFORLoop {
    public static void main(String[] args) {

        String[] names = new String[10];
        int[] marks = new int[10];

        Scanner scan = new Scanner(System.in);

        // INPUT
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter student name: ");
            names[i] = scan.nextLine();

            System.out.print("Enter student mark: ");
            marks[i] = scan.nextInt();
            scan.nextLine(); // clear buffer

            System.out.println("===============================");
        }

        // Transverse through the arrays to display the element of the arrays
		int c = 0;
        System.out.println("\nElements of Names array are:");
        for (String name : names) {
            System.out.printf("%s : %d\n",name,marks[c]);
			c++;
        }

        System.out.println("\nElements of Marks array are:");
        /*for (int mark : marks) {
            System.out.printf("%s : %d", mark);
        }*/
    }
}
