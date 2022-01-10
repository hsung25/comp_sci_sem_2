import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		int x = a;
		int y = b;
		int c = x;
		int z;
		int count = 1;
		while(true)
		{
			y = y-1; 
			z= x*c;
			if (y==count){
				break;
			}
			x=z;
	}
		return z;
	}
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int a = sc.nextInt();
	System.out.println("What is your exponent number?");
	int b = sc.nextInt();
	System.out.println("Your answer is: " + pow(a,b));



		
	}
}
