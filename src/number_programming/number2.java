package number_programming;

public class number2 {
public static void main(String[] args) {
		
		int lines=5;
		int numcount=1;
		int spacecount =2;
		int mid =(lines+1)/2;
		int value =1;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=spacecount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=numcount;k++)
			{
				System.out.print(value);
				value++;
			}
			
			System.out.println();
			value=1;
			if(i<mid)
			{
				numcount=numcount+2;
				spacecount--;
			}
			else
			{
				numcount=numcount-2;;
				spacecount++;
			}
		}
		
	}
}
