package inheritence;
import java.util.Scanner;

/*
public class Loan {

    Scanner sc = new Scanner(System.in);

    // Method to get user details
    void getDetails() {
        System.out.println("Enter your name:");
        String name = sc.next();
        
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to get salary information
    public double salInfo() {
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        return salary;
    }

    // main method
    public static void main(String[] args) {
        Loan L = new Loan();
        L.getDetails();
        double salary = L.salInfo();
        System.out.println("Salary: " + salary);
    }
} */

public class Loan
{
	Scanner sc = new Scanner(System.in);
	public String getDetails()
	{
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter your age");
		int age = sc.nextInt();
		String Details = ""+name +""+age+"";
		return Details;
		
	}
	public Double Salary()
	{
	  System.out.println("enter your salary");
	  double sal = sc.nextDouble();
	  return sal;
	}
	
	public static void main(String []args)
	{
		Loan l = new Loan();
		System.out.println(l.getDetails());
		System.out.println(l.Salary());
	}

}
