import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int secret = rand.nextInt(1000)+1;

	while(true){
	System.out.println("");
	System.out.print("Guess a number: ");
	int guess = sc.nextInt();
	
	{
		if(guess!=secret){
			if (guess<secret)
			{
				System.out.println("You're a little too low!");
			}
			else if (guess>secret)
			{
			System.out.println("You're a little too high!");
			}
		}
		else
			{
				System.out.println("You guessed it!");
				break;
			}
	
		}
	
		
	}
	
		
	

		
	}
}

