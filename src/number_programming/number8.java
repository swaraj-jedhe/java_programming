package number_programming;

public class number8 {

	public static void main(String[] args) {
		
		int numcount=1;
		int value=1;
		int lines=5;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=numcount;j++)
			{
				System.out.print(value);
				value++;
				
			}
			value=1;
			numcount++;
			System.out.println();
		}
		
	}
}
