import java.util.Scanner;

public class SalaryCalculator{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		float pay=0;
		float grossPay=0;
		for (int i=1;i<=3;i++){
			System.out.printf("Enter no.%d Hours worked: ",i);
			int hoursWorked = input.nextInt();
			System.out.printf("Enter no.%d Hourly Rate: ",i);
			int hourlyRate = input.nextInt();
			if (hoursWorked<=40){
				pay =(float) hoursWorked*hourlyRate;
			}
			else{
				pay = (float)(40*hourlyRate)+((hoursWorked-40)*hourlyRate*1.5f);
			}
			grossPay+=pay;
		}
		System.out.printf("Gross pay =%.2f%n",grossPay);
		
	}
}