import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	Random rand = new Random();
	System.out.println("----------------------------------------------------");
	System.out.println("There are 20 numbers");
	int[]x= new int[20];
	int i;
	int k=0;
	for(i=0;i<x.length; i++){
		int y= rand.nextInt(10)+ 1;
		x[i]=y;
		System.out.println(x[i]);
	}
	System.out.println("----------------------------------------------------");
		
	int one = rand.nextInt(10)+1;
	System.out.println("The random number to look for is "+one);

	for (i=0; i< x.length; i++){
			if(one == x[i]){
				System.out.println("Duplicate found at index " +i);
				k++;
				}
			}
	
	
	System.out.println("Total number of duplicates for "+one+" is "+ k);
	System.out.println("----------------------------------------------------");
	System.out.println("Looking for two in a row: ");
	k=1;
	for(i=0; i<x.length; i++){
		if (x[i]==x[k]){
			System.out.println("Two in a row found at indexes "+i+" and "+k+". The number is "+ x[i]);
		}
		k++;
	}
	}
}

	
	

	







