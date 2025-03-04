package LabsJava;

public class PositiveString {
	
	public static void main(String [] args) {
	
		String word = "dog";
		
		boolean isPos = posString(word);
		
		System.out.println(word + " Is positive? " + isPos);
		
		
		
		
	}
	
	public static boolean posString(String word) {
		//make sure is not empty 
		if(word == null || word.isEmpty()) {
			return false;
		}
		//comparing the characters 
		for(int i = 1; i < word.length(); i++) {
			if(word.charAt(i) < word.charAt( i - 1)) {
				return false;
			}
			
		}
		//return true is not out of order
		return true;
		
		
	}

}
