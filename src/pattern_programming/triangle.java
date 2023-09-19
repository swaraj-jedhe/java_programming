package pattern_programming;

public class triangle {

	public static void main(String[] args) {
		
			
			int lines=5;
			int starcount =1;
			int spacecount =4;
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
				for(int j=1;j<=spacecount;j++)
				{
					System.out.print(" ");
				}
				
				for(int s =1;s<=starcount;s++)
				{
					if(s==1|s==starcount)
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
					spacecount=spacecount-2;
				}
				else {
					starcount--;
					spacecount=spacecount+2;
				}
			}
			
		}
	}

