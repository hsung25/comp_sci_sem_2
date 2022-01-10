import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	int[]x = new int[100];

	System.out.println("There are 100 elements.");
	System.out.println();
	
	int i;
	for(i=0; i<x.length; i++){
		int y = 1 + rand.nextInt(100);
		x[i]=y;
	}
	
	int min = 100;
	for (i=0; i<x.length; i++){
		if(x[i]< min){
			min = x[i];
		}
	}
	System.out.println("The minimum of 100 random numbers is: " +min);
	
	int max =0;
	for(i=0; i<x.length; i++){
		if(x[i] > max){
			max = x[i];
		}
	}
		System.out.println("The maximum of 100 random numbers is: "+max);
	
	int total = 0;
	for(i=0; i<x.length; i++){
		total = total + x[i];
	}
		int avg = total / x.length;
		System.out.println("The average of 100 random numbers is: " + avg);
	}
}



