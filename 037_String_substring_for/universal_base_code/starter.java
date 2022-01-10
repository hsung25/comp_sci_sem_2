import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a word.");
	String x = sc.nextLine();
	System.out.println("Letter by letter: ");
	x.length();
	
	int c = 0;
	while (c <x.length()){
		System.out.print(c+ " ");
		System.out.println(x.substring(c, c+1));
		c++;
	}

		
	}
}
