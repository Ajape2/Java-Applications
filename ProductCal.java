import java.util.scanner;

public class ProductCal{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);

        int x,y,z result;
        System.out.print("Enter the first integer: ");
        x = input.nextInt()
        y = input.nextInt()
        z = input.nextInt()
        result = x*y*z
        System.out.printf(Product is %d%n",result);

