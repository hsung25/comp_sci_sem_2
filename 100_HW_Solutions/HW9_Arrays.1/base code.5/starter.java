import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Random rand = new Random();
		System.out.println("There are 20 numbers.");
	
		int[]x = new int[20];
	
		int i;
		for (i = 0; i < x.length; i++){
			int y = rand.nextInt(50)+1;
			x[i] = y;
			System.out.println(x[i]);
		}
			
		
		
		System.out.println("These are the numbers backwards");
		int []z = new int[20];
		for (i = x.length-1; i >= 0; i--){
			System.out.println(z[i]=x[i]);
		}
		
			
   }
}
	
	
	
		
		
		
		







