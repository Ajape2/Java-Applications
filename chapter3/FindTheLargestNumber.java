import java.util.Scanner;

public class FindTheLargestNumber{
	public static void main (String[] args){
		int counter = 1;
		int largest = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (counter <= 10){
			System.out.printf("Input no.%d: ",counter);
			int number = input.nextInt();
			if (number > largest){
				largest = number;
			}
			counter++;
		}
		System.out.printf("Largest = %d%n",largest);
		input.close();
	}
}
