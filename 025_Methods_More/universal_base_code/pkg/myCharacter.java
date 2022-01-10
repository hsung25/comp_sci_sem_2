package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	public myCharacter(){
		role = new String ("No role");
	}
	public myCharacter(String a){
		 role = a;
	}
	public String setRole (String a){
	if (role.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else 
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
		return role;
	
	}


	public int setStrength(int b){
		strength = b;
		return strength;
	}
	public int setDexterity(int b){
		dexterity = b;
		return dexterity;
	}
	public int setIntelligence(int b){
		intelligence = b;
		return intelligence;
	}
	public int setConstitution(int b){
		constitution = b;
		return constitution;
	}
	public int setCharisma(int b){
		charisma = b;
		return charisma;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
		return true;
	}
		public void myToString(){
		System.out.println("Your role is "+ role);
		System.out.println("Your strength trait is " +strength);
		System.out.println("Your dexterity trait is " +dexterity);
		System.out.println("Your intelligence trait is " +intelligence);
		System.out.println("Your constitution trait is " +constitution);
		System.out.println("Your charisma trait is " +charisma);
		return;
	}
	

}



