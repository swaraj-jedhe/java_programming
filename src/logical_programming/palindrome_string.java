package logical_programming;

import java.util.Scanner;

public class palindrome_string {

public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("plz enter the string");
		String input =scanner.next();
		System.out.println("input "+input);
		
		String reverse=" ";
		char[]arr1 =input.toCharArray();
		for(int i=arr1.length-1;i>=0;i--)
		{
			reverse=reverse+arr1[i];
			
		}
		System.out.println("reverse"+reverse);
		if(input.equals(reverse))
		{
			System.out.println(" string is palindrome");
		}
		else
		{
			System.out.println(" string not palindrome");
		}
	}
}
