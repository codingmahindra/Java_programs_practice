package Oopspackage;
public class TestAnimal {
	public static void main(String[] args) {
//		Animal a = new Animal();//Cannot instantiate the type Animal
//		Cat c = new Cat();
//		This is the way of abstraction,
//		Where we can create an object of a class and store that in to interface reference variable.
//		Up-casting
//		List l = new ArrayList();
//		l.add("Srikanth");

		System.out.println("************");
		Animal d = new Dog();
		d.sound();
		d.sleep();
		d.walk();
		d.getAge();
		System.out.println("DOg can eat : " + d.eat());
//		System.out.println("************");
//		Animal m = new Monkey();
//		m.sound();
//		m.sleep();
//		m.walk();
//		System.out.println("Monkey can eat : " + m.eat());
	}
}
