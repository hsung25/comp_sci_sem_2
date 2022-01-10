import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		myCharacter one = new myCharacter();
		one.myToString();
		System.out.println("------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("What class would you like to be?");
		String x = sc.nextLine();
		myCharacter two = new myCharacter(x);
		two.check();
		two.myToString();
	
	}
}

