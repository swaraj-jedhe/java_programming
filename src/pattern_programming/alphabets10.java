package pattern_programming;

public class alphabets10 {


	public static void main(String[] args) {
		int starcount =9;
		int spacecount =0;
		int lines =5;
		int mid =(lines+1)/2;
		
		for(int i=1;i<=lines;i++)
		{
		 for(int j=1;j<=spacecount;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=starcount;k++)
		 {
			 if(k==1||k==starcount)
			 {
				 System.out.print("*");
			 }
			 else
			 {
				 System.out.print(" ");
			 }
			 
			 
		 }
		 System.out.println();
		 spacecount++;
		 starcount=starcount-2;
		 
		}
			
	}
}
