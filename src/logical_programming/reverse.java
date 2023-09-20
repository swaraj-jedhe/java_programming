package logical_programming;

public class reverse {
public static void main(String[] args) {
		
		int sum=0;
		int r=0;
		int num =1234;
		
		while(num!=0)
		{
			r=num%10;//1234%10=4  123%10=3
			sum=sum*10+r;//0*10+4=4   3
			num=num/10;//1234/10=123
			
		}
		System.out.println("reverse "+sum);
	}
}
