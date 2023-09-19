package pattern_programming;

public class alphabets5 {


public static void main(String[] args) {
		
		int lines =5; 
		int starcount =5;
		int mid=(lines+1)/2;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=starcount;k++)
			{
				if(i==1||k==1||i==lines||i==mid)
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
