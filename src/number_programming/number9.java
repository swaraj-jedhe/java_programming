package number_programming;

public class number9 {


	public static void main(String[] args) {
		
		int numcount=1;
		int value=1;
		int lines=5;
		int spacecount=4;
		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=spacecount;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=numcount;j++)
			{
				System.out.print(value);
				value++;
				
			}
			value=1;
			numcount++;
			spacecount--;
			System.out.println();
		}
		
	}
}
