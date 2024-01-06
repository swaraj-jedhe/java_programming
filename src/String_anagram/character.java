
package String_anagram;

public class character {

	public static void main(String[] args) {
		String str="love";
		char[]charr=str.toCharArray();
		for(int i=0;i<=charr.length-1;i++)
		{
			int index=i;
			for(int j=0;j<=charr.length-1;j++)
			{
				System.out.println(charr[index]);
				index++;
				index=index%4;
			}
			System.out.println();
		}
	}
}
