package logical_programming;

public class prime {

	public static void main(String[] args) {
		
		int count=0;
		int num =7;
		 for(int i=1;i<=num;i++)
		 {
			 if(num%i==0)
			 {
				 count++;
			 }
			 
		 }if(count==2)
		 {
			 System.out.println("prime number");
		 }
		 else
		 {
			 System.out.println("not prime");
		 }
	}
}
