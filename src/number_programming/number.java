package number_programming;

public class number {


	
		public static void main(String[] args) {
			
			
			int lines=5;
			int numcount =1;
			int spacecount =1;
			int value=1;
			int mid =(lines+1)/2;
			for(int i=1;i<=lines;i++)
			{
				for(int j=1;j<=numcount;j++)
				{
					System.out.print(value);
					value++;
				}
				System.out.println();
				value=1;
				if(i<mid)
				{
					numcount++;
					
				}
				else
				{
					numcount--;
				}
			}
		
	}
}

