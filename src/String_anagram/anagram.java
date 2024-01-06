package String_anagram;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {

		System.out.println("enter the 1st string");
		Scanner scanner= new Scanner(System.in);
		String string =scanner.nextLine();
		System.out.println("enter the 2st string");
		String string2 =scanner.nextLine();
		 
		String str1 =string.toLowerCase();
		String str2 =string2.toLowerCase();
		
		str1=str1.replace(" ", " ");
		str2=str2.replace(" ", " ");
		
		char[]arr1=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("string is anagram");
			
		}
		else
		{
			System.out.println("string is not anagram");
			
			
		}
		scanner.close();
		
	}
}
