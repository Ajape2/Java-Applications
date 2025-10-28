public class OperatorsPart1 {
    public static void main(String[] args) {
        int num = 50;
        num += 8;
        System.out.printf("The value of num is %d%n", num);
		
		num -= 7;
	    System.out.printf("The value of num is %d%n",num);
		
		num *= 10;
	    System.out.printf("The value of num is %d%n",num);

		
		num /= 5;
	    System.out.printf("The value of num is %d%n",num);

		
		num %= 3;
	    System.out.printf("The value of num is %d%n",num);
	
		//Arithmetic operators
		int num1 = 10;
		int num2 =4;
		String name = "Martins";
		
		
		int sum = num + num2;
		int product = num1 * num2;
		int minus = num1 - num2;
		double divide = (double)num1/num2;
		int modulos = num1%num2;
		
		System.out.printf("Sum is %d%n",sum);
		System.out.printf("product is %d%n",product);
		System.out.printf("difference btw num1 and num2 %d%n",minus);
		System.out.println(name + sum);
		System.out.printf("Result is %f%n",divide);
		System.out.printf("Modulos is %d%n",modulos);
		
		// Relational operators
		int firstNum =12;
		int secondNum =15;
		boolean isGreater = firstNum >secondNum;
		boolean isLesser = firstNum < secondNum;
		boolean isGreaterThanOrEqualTo = firstNum >= secondNum;
		boolean isLesserThanOrEqualTo = firstNum <= secondNum;
		boolean isNotEqualTo = firstNum != secondNum;
		boolean isEqual = firstNum == secondNum;
		
		System.out.printf("is firstNum > scendNum? %b%n",isGreater);
		System.out.printf("is firstNum < secondNum? %b%n",isLesser);
		System.out.printf("is firstNum >= secondNum? %b%n",isGreaterThanOrEqualTo);
		System.out.printf("is firstNUM <= secondNum?%b%n",isLesserThanOrEqualTo);
		System.out.printf("is firstNum != secondNum? %b%n",isNotEqualTo);
		System.out.printf("is firtNum == secondNum? %b%n",isEqual);

		
    }
}
