package number_programming;

public class number5 {

public static void main(String[] args) {
		
		int value =1;
		int numcount =1;
		int lines=5;
		int zero=4;
		
		for(int i=1;i<=lines;i++)
		{
			for(int j =1;j<=zero;j++)
			{
				System.out.print("0");
			}
			for(int k=1;k<=numcount;k++)
			{
				System.out.print(value);
				value++;
				
			}
			value=1;
			System.out.println();
			numcount++;
			zero--;
		}
		
	}
}
