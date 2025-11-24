import java.util.Scanner;

public class GasMileage{
	public static void main(String[] args){
		
		//Declaring variable
		int totalMiles =0 ;
		int totalGallons =0;
		int miles;
		int gallons;
		
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to keep adding for total miles till the person says stop
		System.out.print("Enter miles driven: ");
		miles = input.nextInt();
		while (miles != -1) {
			int count=0;
			//Input prompt
			System.out.print("Enter number of gallons used: ");
			gallons = input.nextInt();
			
			//Decalare and calculate miles per gallons
			float milesPerGallon = (float) miles / gallons;
			totalMiles+=miles;
			totalGallons+=gallons;
			count++;
			System.out.printf("Trip %d.Miles per gallon = %.2f%n",count, milesPerGallon);
			System.out.println("print -1 to end");
			System.out.print("Enter miles driven: ");
			miles = input.nextInt();
		}
		
		//Printing average miles per gallon
		float averageMilesPerGallon = totalMiles/totalGallons;
		System.out.printf("Average Mlies per Gallon = %.2f",averageMilesPerGallon);
		input.close();
		
		
		

		
		
		
		
	}
}