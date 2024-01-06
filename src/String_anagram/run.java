package String_anagram;

public class run {

	public static void main(String[] args) {
		
		String str ="love is mava and mava is mar java";
		String[]factor =str.split("mava");
		for(int i=0;i<=factor.length-1;i++)
		{
			
			System.out.println(factor[i]);
			if(i!=factor.length-1)
			{
				System.out.println("java");
			}
		}
		
	}
}
