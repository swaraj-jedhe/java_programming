package pattern_programming;

public class alphabets2 {

	

public static void main(String[] args) {
		
		int lines =5; 
		int starcount =5;
		int mid=(starcount+1)/2;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=starcount;k++)
			{
				if(i==1||k==mid)
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

