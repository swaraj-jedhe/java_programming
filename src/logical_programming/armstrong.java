package logical_programming;

public class armstrong 
{
	
	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int r =0;
		int temp=num;
		
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		
		}
		if(sum==num)
		{
			System.out.println("armstrong");
			
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
