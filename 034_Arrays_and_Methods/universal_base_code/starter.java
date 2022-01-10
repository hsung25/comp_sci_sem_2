import pkg.*;
import java.util.Scanner;
import java.util.Random;

	
class starter {
	// int[]x = new int[100];
	public static void toStringArray(int[] x){
		int i;
		for(i=0; i<x.length; i++){
			System.out.println(x[i]+ " ");
		}
		return;
	}
	

	public static int getArrayAverage(int[] x){
		int i;
		int total = 0;
		for(i=0; i<x.length; i++){
			total = total + x[i];
		}
		int avg = total / x.length;
		return avg;
	}
	

	public static int getArrayMax(int[] x){
		int i; 
		int max = 0;
		for(i=0; i<x.length; i++){
			if(x[i]>max){
				max = x[i];
			}
		}
		return max;
	}
	
	
	public static int getArrayMin(int[] x){
		int i;
		int min = 100;
		for(i=0; i<x.length; i++){
			if(x[i]<min){
				min = x[i];
			}
		}
		return min;
	}
	
	
	
	public static void main(String args[]) {
		int[]arr = new int [100];
		Random rand = new Random();
		int i = 0;
		for(i=0; i<arr.length; i++){
			int y = 1 + rand.nextInt(100);
			arr[i]=y;
			}
	
		toStringArray(arr);
		System.out.println("The maximum of 100 random numbers is: " +getArrayMax(arr));
		System.out.println("The minimum of 100 random numbers is: " +getArrayMin(arr));
		System.out.println("The average of 100 random numbers is " +getArrayAverage(arr));
		
	}
}

		

