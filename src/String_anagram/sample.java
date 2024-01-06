package String_anagram;

import java.util.Scanner;

public class sample {

	
	public static void main(String[] args) {
		
		System.out.println("enter the string ");
		Scanner scanner =new Scanner(System.in);
		String string = scanner.next();
		char [] arr1= string.toCharArray();
		
		 int vowelcount=0;
		 int consonent =0;
		 for(int i=0;i<=arr1.length-1;i++)
		 {
			 if(arr1[i]=='a'||arr1[i]=='e'||arr1[i]=='i'||arr1[i]=='o'||arr1[i]=='u')
			 {
				 vowelcount++;
				 
			 }
			 else
			 {
				 consonent++;
			 }
		 }System.out.println("vowelcount::"+vowelcount);
		 
		 System.out.println("consonet::"+consonent);
		scanner.close();
	}
}
