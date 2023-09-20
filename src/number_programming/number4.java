package number_programming;

public class number4 {
	public static void main(String[] args) {
		
		int lines=5;
		int value=1;
		int numcount =1;
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
			System.out.println();
			value=1;
			numcount=numcount+2;
			spacecount--;
		}
		}
}
