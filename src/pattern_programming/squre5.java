package pattern_programming;

public class squre5 {

public static void main(String[] args) {
		
		int lines =5;
		int starcount =1;
		int spacecount =2;
		int mid =(lines+1)/2;
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=spacecount;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=starcount;j++)
			{
				if(j==1||j==starcount)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i<mid)
			{
				starcount=starcount+2;
				spacecount--;
				
				
			}
			else
			{
				spacecount++;
				starcount=starcount-2;
			}
		}
		
			
	}
}
