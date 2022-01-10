import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
	
		int total = 100;
		while(total>0){
		System.out.println("--------------------------------------------------");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
		String play = sc.nextLine();
		if (play.equalsIgnoreCase("Yes")||(play.equalsIgnoreCase("Y")))
		{
			System.out.print("You have $"+total+". How much would you like to wager? ");
			int wager1 = sc.nextInt();
			System.out.println("");
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			String roll = sc.nextLine();
			int a = 1 + rand.nextInt(10);
			int b = 1 + rand.nextInt(10);
			int c = 1 + rand.nextInt(10);
			System.out.println("_______________________");
			System.out.println("| "+a+" | "+b+" | "+c+" |");
				System.out.println("_______________________");
			if(((a==b)||(b==c)&&(a!=c))||((a==b)||(a==c)&&(b!=c))||((a==c)||(b==c)&&(a!=b)))
			{
				total=total+wager1;
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $"+total);
			}
			else if ((a==b)&&(b==c))
			{
				total=total+(2*wager1);
				System.out.println("You won! Your wager has now been tripled!");
				System.out.println("You now have $"+total);
			}
			else
			{
				total=total-wager1;
				System.out.println("Didn't win this time, better luck next time!");
				System.out.println("You now have $" + total);
			}
				if (total==0)
			{
				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				{
					break;
				}
			}
		}
		else if ((play.equalsIgnoreCase("No"))||(play.equalsIgnoreCase("N")))
		{
			System.out.println("Sad to see you go! You still have $"+total+" left. Come again soon! Thanks!");
			break;
		}
		else 
		{
			System.out.println("That wasn't quite the correct answer. Try again.");
		}
	}
}
}
