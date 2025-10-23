public class HelloWorld{
   public static void main (String[] agrgs) {
	   int num = 50;
	   String name = "Jack";
	   Float deci = 9.99999f;
	   boolean isFun = true;
	   char symbol = '$';
	   
	   //using println method
       System.out.println("Hello MyWorld,this is my First java program") ;
	   System.out.println("learning java is fun");
	   
	   //using print method
	   System.out.print("The print method should be used to accept input");
	   System.out.print("Another print Method \n");
	   
	   //using printf method
	   System.out.printf("I bought %d quantity of bread%n",num);
	   System.out.printf("My name is %s%n",name);
	   System.out.printf("Your balance is %c%.2f%n",symbol,deci);
	   System.out.printf("Is Jvaa fun? %b%n",isFun);
	   System.out.print("Do you enjoy learning \"Java\"");
	   
	}   
	
}