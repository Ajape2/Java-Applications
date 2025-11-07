import java.util.Scanner;

public class ValidatingUserInput{
	public static void main(String[] args){
		int num=1;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input Integer (except 1 or 2): ");
		num=input.nextInt();
		
		while (num==1 || num==2){
			System.out.println("Invalid Input");
			System.out.print("Input Integer (except 1 or 2): ");
			num=input.nextInt();
		}
		System.out.println("Program Continues");
		input.close();
	}
}