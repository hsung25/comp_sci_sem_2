import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Your role is Wizard");
	int strength = 5;
	int dex = 5; 
	int intel = 5;
	int cons = 5;
	int charisma = 5;
}

class starter {
	
	public static void main(String args[]) {
		// Your code goes below here

	Character x = new Character();
	System.out.println(x.role);
	Character s = new Character();
	System.out.println("Your strength trait is "+s.strength+"");
	Character d = new Character();
	System.out.println("Your dexterity trait is "+d.dex+"");
	Character i = new Character();
	System.out.println("Your intelligence trait is "+i.intel+"");
	Character c = new Character();
	System.out.println("Your constitution trait is "+c.cons+"");
	Character ch = new Character();
	System.out.println("Your charisma trait is "+ch.charisma+"");
	


		
	}
}
