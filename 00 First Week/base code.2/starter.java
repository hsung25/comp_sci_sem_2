import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter one number");
	int one = sc.nextInt();
	
	System.out.println("Enter another number");
	int two = sc.nextInt();
	
	if (one%2==0)
	{
		System.out.println("Your first number is even.");
	}
	else 
	{
		System.out.println("Your first number is odd.");
	}
	
	if (two%2==0)
	{
		System.out.println("Your second number is even.");
	}
	else 
	{
		System.out.println("Your second number is odd.");
	}
	
	
	if (one%3==0)
	{
		System.out.println("Your first number is divisible by 3.");
	}
	else
	{
		System.out.println("Your first number is not divisible by 3.");
	}
	
	if (two%3==0)
	{
		System.out.println("Your second number is divisible by 3.");
	}
	else
	{
		System.out.println("Your second number is not divisible by 3.");
	}
	
	if (one%4==0)
	{
		System.out.println("Your first number is divisible by 4.");
	}
	else
	{
		System.out.println("Your first number is not divisible by 4.");
	}
	
	if (two%4==0)
	{
		System.out.println("Your second number is divisible by 4.");
	}
	else
	{
		System.out.println("Your second number is not divisible by 4.");
	}

	if (one%5==0)
	{
		System.out.println("Your first number is divisible by 5.");
	}
	else
	{
		System.out.println("Your first number is not divisible by 5.");
	}
	
	if (two%5==0)
	{
		System.out.println("Your second number is divisible by 5.");
	}
	else
	{
		System.out.println("Your second number is not divisible by 5.");
	}
	
	}
}
