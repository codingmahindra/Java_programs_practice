package Oopspackage;
//in interfaces, by default
//all variables are "public static and final" whether we declared or not.
//all methods are "public and abstract" whether we declared or not.
//final variables, we cannot change.
public interface Animal {
	public static void main(String[] args) {
		System.out.println("Hello main method in interface ");
		breath();
//		getAge();
	}
	// up to 1.7 version
	public static final String orgId = "v123";
	public abstract void sound();
	public abstract void walk();
	public abstract void sleep();
    public abstract String eat();
//	1.9 version : private methods
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
//	1.8 version : default methods
	public default void getAge() {
		System.out.println("Default age of animal : 2 years ");
		hello();
	}
//	1.8 version
	public default void getAge1() {
		System.out.println("Default age of animal : 2 years ");
		hello();
	}
//	1.8 version
	public default void getAge2() {
		System.out.println("Default age of animal : 2 years ");
		hello();
	}
//	1.8 version  : static methods
	public static void breath() {
		System.out.println("Every animal should breath !");
	}
}

