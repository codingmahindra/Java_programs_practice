
package Oopspackage;
public class Dog implements Animal {
	
	public void sound() {
		System.out.println("Bow bow !!");
	}
	
	public void walk() {
		System.out.println("Dog can walk and run like anything !");
    }
	public void sleep() {
		System.out.println("mostly dogs can sleep mornings ");
	}
	public String eat() {
		return "cat";
	}
	public void getAge() {
		System.out.println("Dog age : " + "1 year");
	}
}



