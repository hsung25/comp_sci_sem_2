import java.util.Scanner;
import java.util.Random;

class Dog{
	String name;
	int age;
	String breed; 
	
	public Dog(){
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
		
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = new String("dog dog");
	}
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(String a, int c){
		name = a;
		age = c;
		breed = new String ("dog dog");
	}
	
	public void setName(String a){
		name= a;
		return;
	}
	public void setAge(int c){
		age = c;
		return;
	}
	public void setBreed(String b){
		breed = b;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		int rand_num1 = rand.nextInt(2);
		if (rand_num1==1){
			return true;
		}
		else{
			return false;
		}
	private void bark(){
		System.out.println(""+name+" barks.");
		return; 
	}

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a name for your dog.");
	String a = sc.nextLine();
	System.out.println("How old is "+a+"?");
	int c = sc.nextInt();
	Dog one = new Dog(a,c);
	Dog two = new Dog("Luna", "German Shepherd");

	System.out.println(one.getName() +" is a " + one.getBreed() + "that is" +one.getAge()+ "years old.");
	System.out.println(two.getName() +"is a " + two.getBreed() + "that is" + two.getAge()+ "years old.");
	
	boolean hello = one.isSleeping();
	if (hello==true){
		System.out.println(a+"is sleeping.");
	}
	else{
		System.out.println(a + "is awake!");
		one.bark();
	}
	
	boolean kitty = two.isSleeping();
	if (kitty == true && hello==false){
		System.out.println("Luna is sleeping.");
		System.out.println(""+a+" barks.");
		two.bark();
	}
	else if (kitty == false && hello==false){
		System.out.println("Luna is awake.");
		System.out.println(""+a+" barks.");
		two.bark();
	}
	
	}






