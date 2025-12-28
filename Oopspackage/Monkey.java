
package Oopspackage;
public class Monkey implements Animal {

	public void sound() {
		System.out.println("kich kich ..");
	}
	
	public void walk() {
		System.out.println("Monkey can walk and jump ");
	}
	public void sleep() {
		System.out.println("Monkey can sleep at anytime.");
	}

	public String eat() {
		return "Banana";
	}
}



