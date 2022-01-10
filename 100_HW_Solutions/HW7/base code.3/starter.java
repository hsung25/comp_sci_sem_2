import java.util.Scanner;
import java.util.Random;

class dog{
	String name;
	int age;
	String breed; 
	
	public dog(){
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
		
	}
	public dog(String a, int b, String c){
		name = a;
		age = 1;
		breed = new String("dog dog");
	}
	public dog(String d, int e, String f){
		name = d;
		age = 1;
		breed = f;
	}
	public dog(String g, int h, String i){
		name = g;
		age = h;
		breed = new String ("dog dog");
	}
	
	public void setName(String j){
		String x = j;
		return;
	}
	public void setAge(int k){
		int y =k;
		return;
	}
	public void setBreed(String l){
		String z=l;
		return;
	}
	public String getName(String j){
		return x;
	}
	public int getAge(int k){
		return y;
	}
	public String getBreed(String l){
		return z;
	}
	public boolean isSleeping(boolean m){
		Random rand = new Random();
		if (rand_num1==0){
			
		}
			int rand_num1 = rand.nextInt();
	}
	public void bark(){
		System.out.println("The dog's name is "+name+" and it barks.");
		return; 
	}

class starter {
	public static void main(String args[]) {

	dog test = new dog();
	// test.();
	dog two = new dog("Luna");
	two.bark();
		
	
	}
}
