package pattern_programming;

public class alphabets {

public static void main(String[] args) {
		
		int lines =5; 
		int starcount =5;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=starcount;k++)
			{
				if(k==1||i==lines)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
