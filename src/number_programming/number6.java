package number_programming;

public class number6 {

	public static void main(String[] args) {
		int value=1;
		int numcount =5;
		int lines=5;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=numcount;j++)
			{
				System.out.print(value);
				value++;
			}
			value=1;
			System.out.println();
		}
		
	}
}
