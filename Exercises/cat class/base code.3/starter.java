import java.util.Scanner;
import java.util.Random;

class cat{
	String name;
	public cat(){
		name = new String("Garfield");
	}
	
	public cat(String a){
		name = a;
	}
	
	public void meow(){
		System.out.println("The cat's name is "+name+" and he meows.");
		return;
	}
}
class starter {
	public static void main(String args[]) {
		
	cat test = new cat();
	test.meow();
	cat pest = new cat("Mochi");
	pest.meow();
		
	}
}
