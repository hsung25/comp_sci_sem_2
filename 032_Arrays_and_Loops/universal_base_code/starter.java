import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	int[]x = new int[1000];
		int i;
		for (i = 0; i < x.length; i++){
			int y = rand.nextInt(100)+1;
			x[i] = y;
		
		}
		
		for( i = 0; i <x.length; i++){
			System.out.println(x[i]);
		}
		
	// int c = 0;
	// while (c<1000){
	// 	int y = rand.nextInt(1000)+1;
	// 	x[c]=y;
	// }
	
	// y=0;
	// while(y<1000){
	// 	System.out.println(x[c])
	// 	c++;
	// }
	

		
	}
}
