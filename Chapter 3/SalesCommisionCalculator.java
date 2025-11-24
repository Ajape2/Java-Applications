import java.util.Scanner;

public class SalesCommisionCalculator{
	public static void main (String[] args){
		int totalSales =0;
		int count =1;
		int sales =0;
		
		Scanner input = new Scanner(System.in);
	
		while (sales!=-1){
			System.out.println("Input -1 to end");
			System.out.printf("Enter value of item %d: ",count);
			sales=input.nextInt();
			
			if (sales == -1){
				break;
			}
			totalSales+=sales;
			count++;
			
		}
		float earnings = (float) (200+(0.09*totalSales));
		System.out.printf("Total earnings = %.2f%n",earnings);
	}
}