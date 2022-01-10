import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Random rand = new Random();


	
	int rand_num1 = rand.nextInt(10);
	System.out.println("A number between 0 - 9: "+rand_num1+"");
	int rand_num2 = rand.nextInt(100)+1;
	System.out.println("A number between 1 - 100: "+rand_num2+"");
	double rand_num3 = rand.nextDouble()+2.5;
	System.out.println("A number between 2.5 and 3.5: "+rand_num3+"");
	int rand_num5 = rand.nextInt(575);
	double rand_num4 = rand.nextDouble()+14;
	System.out.println("A double between 14 and 589: "+(rand_num4+ + rand_num5)+"");
	
	

		
	}
}
