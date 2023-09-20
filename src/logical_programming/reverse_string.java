package logical_programming;

public class reverse_string {
public static void main(String[] args) {
		
		String name="JAVA";
		System.out.println("input "+name);
		char[]arr1=name.toCharArray();
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]);
		}
		
	}
}
