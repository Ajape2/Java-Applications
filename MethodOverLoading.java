import java.util.Scanner;
public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Calculate perimeter of Different shapes");
		System.out.println("Enter 1:for square");
		System.out.println("Enter 2: for Rectangle");
		System.out.println("Enter 3 : for triangle");
		System.out.println("Enter 4 : for exit");
		
		
	}
	public void perimeter(int a){
         int per = 4 * a;
         System.out.printf(The perimeter of the square is %d%",per);		 
	}
	public void perimeter(int a,int b){
		int per = 2 * (a + b);
		 System.out.printf("The perimeter of the rectangle is %d%",per);

	}
	public void perimeter(int a,int b, int c);
		int per = a + b + c;
		 System.out.printf("The perimeter of the triagnle is %d%n",per);
	}
}