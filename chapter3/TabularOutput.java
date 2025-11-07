public class TabularOutput{
	public static void main(String[] args){
		System.out.println("N\t10*N\t100*N\t1000*N\n");
		
		for (int n=1;n<=5;n++){
			int n10=(int)10*n;
			int n100=(int) 100*n;
			int n1000=(int) 1000*n;
			System.out.printf("%d\t%d\t%d\t%d%n",n,n10,n100,n1000);
		}
	}
}