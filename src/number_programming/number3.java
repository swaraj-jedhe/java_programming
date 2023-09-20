package number_programming;

public class number3 {
	public static void main(String[] args) {
		
		int lines =5;
		int numcount =1;
				
		int value=1;
		int spacecount =4;
		int mid=(lines+1)/2;
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=numcount;j++)
			{
				System.out.print(value);
				value++;
				
			}
			value=1;
			for(int k=1;k<=spacecount;k++)
			{
				System.out.print(" ");
			}
			for(int v=1;v<=numcount;v++)
			{
				System.out.print(value);
				value++;
				
			}
			System.out.println();
			value=1;
			if(i<mid)
			{
				numcount++;
				spacecount =spacecount-2;
				
			}
			else
			{
				numcount--;
				spacecount =spacecount+2;
				
			}
		}
		}
}
