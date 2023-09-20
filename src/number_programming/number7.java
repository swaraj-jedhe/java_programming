package number_programming;

public class number7 {

	public static void main(String[] args) {
		int numcount=5;
		int value=1;
		int lines=5;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=numcount;j++)
			{
				if(i==1||i==lines||j==1||j==numcount)
				{
					System.out.print(value);
					
				}
				else
				{
					System.out.print(" ");
				}
				value++;
				
			}
			
			value=1;
			System.out.println();
		}
	}
}
