package logical_programming;

public class palindrome {

public static void main(String[] args) {
		
		int sum=0;
		int r=0;
		int num=454;
		int temp =num;
		
		while(temp!=0)
		{
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		if(sum==num) {
			
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
