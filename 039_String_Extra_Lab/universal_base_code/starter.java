import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a sentence.");
	String a = sc.nextLine();
	String b = " ";
	int x = a.indexOf(b);
		for(int i = x; i < a.length(); i++){
			String y = a.substring(i, i+1);
			System.out.print(y);
              }
    
		
	}
}
