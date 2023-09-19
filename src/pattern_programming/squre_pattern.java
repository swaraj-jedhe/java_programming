package pattern_programming;

public class squre_pattern {

	public static void main(String[] args) {
		
		
		int lines =5; 
		int starcount =5;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=starcount;k++)
			{
				if(i==1||k==1||i==lines||k==starcount)
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

