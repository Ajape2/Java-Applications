public class CheckerbroadPatternOfAsterisk{
	public static void main(String[] args){
		for (int rowNumber=1;rowNumber<=8;rowNumber++){
			if (rowNumber%2==1){
				System.out.println("*".repeat(8));
			}
			else if (rowNumber%2==0){
				System.out.println(" "+"*".repeat(8));
			}
		}
	}
}