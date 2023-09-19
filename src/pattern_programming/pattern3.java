package pattern_programming;

public class pattern3 {

	public static void main(String[] args) {

		
		int starcount =1;
		int lines=5;
		int spacecount=4;
		
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=spacecount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=starcount;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcount=starcount+2;
			spacecount--;
			
		
		
	}
	
}
	}

