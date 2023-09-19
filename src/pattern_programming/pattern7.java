package pattern_programming;

public class pattern7 {

	public static void main(String[] args) {
		
			int starcount =1;
			int lines=5;
			int spacecount=4;
			int mid =(lines+1)/2;
			
			
			for(int i=1;i<=lines;i++)
			{
				
				for(int k=1;k<=starcount;k++)
				{
					System.out.print("*");
				}
				for(int s=1;s<=spacecount;s++)
				{
					System.out.print(" ");
				}
				
				
				for(int v=1;v<=starcount;v++)
				{
					System.out.print("*");
				}
				
				System.out.println();
				if(i<mid)
				{
					starcount++;
					spacecount=spacecount-2;
				}
				else
				{
					starcount--;
					spacecount=spacecount+2;
				}
			}
		}

	
}
