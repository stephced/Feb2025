package LabsJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lab7Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open scanner 
		Scanner scanner = new Scanner(System.in);
		
		//asking user for word 
		System.out.println("Please enter a word: ");
		String w = scanner.nextLine();
		
		//asking user to choose which option they would like to use
		System.out.println("Please choice which option ");
		System.out.println("1 -Add the String to itself ");
		System.out.println("2 -Replace odd positions with # ");
		System.out.println("3 -Remove duplicate characters in String ");
		System.out.println("4 -Change odd characters to Upper case ");
		
		System.out.println("Please enter choice 1-4: ");
		int x = scanner.nextInt();
		
		//Users choice
		String choice = stringOption(w, x);
		 
		
		//display choice 
		System.out.println("Results: " + choice);
		
		//close scanner 
		scanner.close();

	}
	
	public static String stringOption(String word, int choice) {
		//which method to choose from 
		switch(choice) {
			case 1: 
				return addStringToSelf(word);
			case 2:
				return replaceOddPosition(word);
			case 3:
				return removeDuplicate(word);
			case 4:
				return changeOddToUpper(word);
			default:
				return "Invaild entry!!";
			
		}
	}
	
	public static String addStringToSelf(String word){
		
		return word + word;
	}
	
	public static String replaceOddPosition(String word) {
		
		StringBuilder sb = new StringBuilder(word);
		
		for(int i = 0; i < word.length(); i++) {
			//find odd to replace to upper
			if(i % 2 == 1) {
				sb.append('#');
			}else {
				sb.append(word.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public static String removeDuplicate(String word) {
		Set<Character> seen = new HashSet<>();
		StringBuilder sb = new StringBuilder(word);
		
		for(char w : word.toCharArray()) 
		{
			if(!seen.contains(w)) {
				seen.add(w);
				sb.append(w); 
			}
		}
		
		return sb.toString();
	}
	
	public static String changeOddToUpper(String word) {
		
		StringBuilder sb = new StringBuilder(word);
		
		for(int i = 0; i < word.length();i++) {
			if(i % 2 == 0) {
				sb.append(Character.toUpperCase(word.charAt(i)));
			}else {
				sb.append(word.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
}
