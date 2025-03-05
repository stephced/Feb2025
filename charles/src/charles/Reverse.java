package charles;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String word;
		
		while(true) {
			
			System.out.println("Enter a String (q to quit): ");
			
			word = input.nextLine();
			
			if(word.equals("q")) break;
		
		
		System.out.println("The String is " + word);
		
		//String reversed = toReverse(word);
		
		String reversed = buildReverse(word);
		
		System.out.println("The reversed String is: " + reversed);
		
		
		}
		
		input.close();
		

	}
	
	//create a method that takes a string, reverses it and returns the revered string
	
	public static String toReverse(String word) {
		
		int len = word.length();
		
		String reverse = "";
		
		for(int i = 0; i < len; i++) {
			
			reverse += word.substring(len - i - 1, len - i - 1 + 1);
		}
		
		
		
		return reverse;
	}
	
	public static String buildReverse(String word) {
		
		return (new StringBuilder(word)).reverse().toString();
		
		
		
		
	}

}
