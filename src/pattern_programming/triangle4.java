package pattern_programming;

public class triangle4 {

	public static void main(String[] args) {
		
		
		int lines =5;
		int spacecount=2;
		int starcount=1;
		int mid =(lines+1)/2;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=starcount;k++)
			{
				if(k==1||k==starcount)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=1; j<=spacecount;j++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=starcount;l++)
			{
				if(l==1||l==starcount)
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
					starcount++;
					spacecount--;
					
				}
				else
				{
					starcount--;
					spacecount++;
				}
			
			}
			
			
		}
		

}
