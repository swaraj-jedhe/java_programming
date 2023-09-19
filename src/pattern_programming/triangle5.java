package pattern_programming;

public class triangle5 {
public static void main(String[] args) {
		
		int starcount =1;
		int spacecount =4;
		int lines =5;
		
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=spacecount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=starcount;k++)
			{
				
				if(k==1||k==starcount||i==lines)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
				starcount=starcount+2;
				spacecount--;
	
		}
	}
}
