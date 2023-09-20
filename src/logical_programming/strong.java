package logical_programming;

public class strong {

	public static void main(String[] args) {
		
		int sum=0;
		int r=0;
		int  num=145;
		
		int temp=num;
		while(temp!=0)
		{
			r=temp%10;
			int fact=1;
		
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("not strong number");
		}
		
	}
}
