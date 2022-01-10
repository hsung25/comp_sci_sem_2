import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
	
		
		System.out.println("What is your name?");
		String name = sc.nextLine ();
		
		System.out.println("What is your age?");
		int a = sc.nextInt();
		
		System.out.println("What month were you born? (1-12)");
		int b = sc.nextInt();
		
		System.out.println("What day were you born? (1-31)");
		int c = sc.nextInt();
		
		System.out.println("What year were you born?");
		int d = sc.nextInt();
		
		System.out.println("If I had a dollar and two quarters, how much money do I have? (0.0-#)");
		double e = sc.nextDouble();
		
		System.out.println("Your name is "+name+" and you were born on "+b+"/"+c+"/"+d+".");
		System.out.println("You are "+a+" years old!!!");
		System.out.println("You have $"+e+" in your wallet.");
		
		
	
	
	}
}
