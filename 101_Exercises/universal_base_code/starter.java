import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();
		
		Ascii one = new Ascii();
		one.setType("Human");
		one.setName("Amy");
		one.setNumber(2);
		one.printArt();
		
		Ascii two = new Ascii("Dog", 3);
		two.setName("Cat");
		two.printArt();
		
		Ascii three = new Ascii("Cactus", "Dan", 4);
		three.printArt();
		
		Ascii four = new Ascii("Other");
		four.setAscii("| (• ◡•)| (❍ᴥ❍ʋ)");
		four.printArt();
		
		Ascii five = new Ascii("Love");
		five.setName("Amy");
		five.setNumber(3);
		five.printArt();
		
		
		
	}
}
