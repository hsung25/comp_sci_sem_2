import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	
	int c = 1;
	while(true)
	{
		int x = rand.nextInt(100)+1;
		System.out.println(x);
		if(c==100){
			break;
		}
		c= c+1;
	}

		
	}
}
