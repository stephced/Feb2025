package charles;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		if((x % 3 == 0) && (x % 5 == 0)) {
			
			System.out.println("FizzBuzz!");
			
		}else if(x % 5 == 0){
			
			System.out.println("Buzz!");
		}else if(x % 3 == 0) {
			System.out.println("FIzz!");
		}else {
			boolean z = isPrime(x);
			System.out.println("Prime" + z);
		}

	}
	
	private static boolean isPrime(int m) {
		
		if(m == 1) return false;
		
		if(m % 2 == 0) return false;;
		
		for(int i = 3; i <= Math.sqrt(m); i+= 2) {
			
			if(m % 1 == 0) {
				
				return false;
			}
		}
		
		return true;
	}

}
