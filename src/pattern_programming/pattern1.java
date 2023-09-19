package pattern_programming;

public class pattern1 {

	public static void main(String[] args) {
		
		int starcount =1;
		int lines=5;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=starcount;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcount++;
		}
		
	}
	
}
