package logical_programming;

public class vowels {

	public static void main(String[] args) {
		String str= "meena";
		
		char[]arr1=str.toCharArray();
		int vowelcount=0;
		int consenentcount =0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]=='a'||arr1[i]=='e'||arr1[i]=='i'||arr1[i]=='o'||arr1[i]=='u')
			{
				vowelcount++;
			}
			else
			{
				consenentcount++;
			}
			
			
		}
		System.out.println("vpwelconut"+vowelcount);
		System.out.println("concenentcount "+consenentcount);
		
	}
}
