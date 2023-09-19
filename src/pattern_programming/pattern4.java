package pattern_programming;

public class pattern4 {
public static void main(String[] args) {

		
		int starcount =1;
		int lines=5;
		int spacecount=2;
		int mid =(lines+1)/2;
		
		
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
