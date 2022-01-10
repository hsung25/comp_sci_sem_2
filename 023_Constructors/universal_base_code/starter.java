import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Scanner sc = new Scanner(System.in);
		myCharacter one = new myCharacter();
		one.check();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String x = sc.nextLine();
		myCharacter two = new myCharacter(x);
		two.check();
	
	}
}
