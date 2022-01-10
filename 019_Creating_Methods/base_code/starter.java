import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String a){
		String x = a;
		System.out.println(x);
		return;
	}
	
	public static void toStringCombined(String a, String b){
		String x = a;
		String y = b; 
		System.out.println(x+" "+y);
		return;
	}

	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	toString("Write a sentence!");
	String a= sc.nextLine();
	
	toString("Write a sentence!");
	String b= sc.nextLine();
	System.out.println("");
	System.out.println("This is using the methods!");
	toString(a);
	toStringCombined(a,b);
	
	}
}
