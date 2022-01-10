import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int x = sc.nextInt();
	
	int y = x;
	int c = x;
	
	int count = 1;
	while(true)
	{
		c = c - 1;
		y = y * count;
		if (count==x-1)
		{
			break;
		}
		count = count+1;
	}
	
	System.out.println(y);
	
	
	int h = 10;
	while(true)
	{
		System.out.println(h);
		if(h==0)
		{
			break;
		}
		h = h - 1;
	}

	}
	
	
}
		
	

