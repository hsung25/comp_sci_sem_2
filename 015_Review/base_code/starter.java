import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();

		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String x = sc.nextLine();
		if (x.equalsIgnoreCase("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(x.equalsIgnoreCase("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(x.equalsIgnoreCase("Rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}

		System.out.println("");
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");

		System.out.println("");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		int total=0;

		if(strength>10)
		{
			System.out.print("Please input a smaller value. Strength (1-10): ");
			int a = sc.nextInt();
			System.out.println("You have "+total+" left to spend.");
			if(a<=10)
			{
				total= 25- a;
				System.out.println("You have "+total+" left to spend.");
			}
		}
		else
		{
			total=25-strength;

			System.out.println("You have "+total+" left to spend.");
		}

		System.out.println("");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();


		if (dexterity>10)
		{
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			int b = sc.nextInt();
			if(b<= 10)
			{
				total = total-b;
				System.out.println("You have "+total+" left to spend.");
			}
		}
		else
		{
			total = total-dexterity;
			System.out.println("You have "+total+" left to spend.");
		}

		System.out.println("");
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();

		if (intelligence>10)
		{
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
				int c = sc.nextInt();
				if(c<= 10)
				{
					total=total-c;
					System.out.println("You have "+total+" left to spend.");
				}
		}
		else
		{
			total= total-intelligence;
			System.out.println("You have "+total+" left to spend.");
		}

		System.out.println("");
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		int totalcon = 0;

		if (constitution>10)
		{
			System.out.print("Please input a smaller value. Constitution (1-10): ");
				int d = sc.nextInt();
				if(d<= 10)
				{
					total=total-d;
					System.out.println("You have "+total+" left to spend.");
				}
		}
		else
		{
			total= total-constitution;
			System.out.println("You have "+totalcon+" left to spend.");
		}

		System.out.println("");
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		int totalchar = 0;

		if (charisma>10)
		{
			System.out.print("Please input a smaller value. Charisma (1-10): ");
				int e = sc.nextInt();
				if(e<= 10)
				{
					total=total-e;
					System.out.println("You have "+total+" to spend for next time.");
				}
		}

		else
		{
			System.out.println("You have "+totalchar+" to spend for next time.");
		}

		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("You are "+name+", the "+title+" of CVHS.");
		System.out.println("You're a "+x+" with the following stats!");
		System.out.println("Strength - "+strength+"");
		System.out.println("Dexterity - "+dexterity+"");
		System.out.println("Intelligence - "+intelligence+"");
		System.out.println("Constitution - "+constitution+"");
		System.out.println("Charisma - "+charisma+"");
		System.out.println("");
		System.out.println("Good luck on your quest "+name+"! :D");




	}
  }
