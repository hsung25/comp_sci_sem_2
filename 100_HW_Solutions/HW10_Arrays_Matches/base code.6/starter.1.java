import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	int[] rand = new int [10];
	for (int i=0; i< rand.length; i++){
		rand[i] = Canvas.rand(10);
	}
	
	int target = Canvas.rand(10);
	System.out.print("rand array: ");
	print(rand);
	System.out.println("target: "+ target);
	int count = 0;
	
	System.out.println("indicies: ");
	for(int i=0; i<rand.length; i++){
		if(target == rand[i]){
			count++; 
			System.out.println(i + ", ");
		}
	}
	
	System.out.println();
	System.out.println("total: "+ count);
	}
	
	static void print(int [] a)
	{
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+", ");
		}
		System.out.println();
	}
	

	
	}


	
		// for (j= i+1; j< x.length; j++){

	


	// if(x[i]==x[j]){
			// System.out.println("Duplicate found at index "+ x[i]);




