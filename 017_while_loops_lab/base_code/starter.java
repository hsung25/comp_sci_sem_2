import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a name.");
	String name = sc.nextLine();
	System.out.println("How many times would you like this name to be repeated?");
	int number = sc.nextInt();
	int count = 1;
	while(true) 
	{
		System.out.println(name);
	if(count == number)
	{
	break;
	}
	count = count + 1;
	} 


		
	}
}
