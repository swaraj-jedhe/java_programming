package pattern_programming;

public class alphabets7 {

	public static void main(String[] args) {
		
		int starcount =5;
		int lines=5;
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=starcount;k++)
			{
				if(k==i||i+k==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}System.out.println();
		}
	}
}
