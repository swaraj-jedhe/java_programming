package String_anagram;

import java.util.Arrays;
import java.util.Scanner;

public class program {
public static void main(String[] args) {
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("plz enter 1st word");
	String first =scanner.next();
	System.out.println("plz enter second word");
	String second =scanner.next();
	
	char[]arr1=first.toCharArray();
	char[]arr2=second.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(Arrays.equals(arr1, arr2)) {
		System.out.println("string is anagram");
		
	}
	else
	{
		System.out.println("string is not anagram");
		
	}
	scanner.close();
}

	
}
