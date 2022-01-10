import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.Scanner sc = new Scanner (System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your first number: ");
		int amy = sc.nextInt();
		System.out.println("Please input your second number: ");
		int david = sc.nextInt();
		System.out.println("Please enter your third number: ");
		int hannah = sc.nextInt();
	
	
		if ((amy>david) && (amy>hannah))
		{
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was "+amy+"");
			}
			
		if ((david>amy) && (david>hannah))
		{
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was "+david+"");
			}
			
		if ((hannah>david) && (hannah>amy))
		{
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was "+hannah+"");
			}
			
		if ((amy<david) && (amy<hannah))
		{
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was "+amy+"");
			}
			
		if ((david<amy) && (david<hannah))
		{
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was "+david+"");
			}
			
		if ((hannah<david) && (hannah<amy))
		{
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was "+hannah+"");
			}
			
			
		
	}
}
