/* 
class Employee{
    //data members 
    String  empName;
    int empNum;
    float salary;
     
    // data methods
    void setdetails( String empName , int empNum,int salary){
        this.empName = empName;
        this.empNum = empNum;
        this.salary = salary;

    }
    void getdetails(){
        System.out.println(""+empName);
        System.out.println(""+empNum );
        System.out.println(""+salary);

    }


}
public class first{
    public static void main(String [] args ){
        Employee e = new Employee();
        e.setdetails("mahi", 123,1000 );
        e.getdetails();
        Employee e1 = new Employee();
        e1.setdetails("vishnu",99,1000);
        e1.getdetails();

    }
}
    */

/* class student{
    int rollNumber;
    String name;
    student(){
        rollNumber = 66;
        name = "mahi";

    }
    void display{
        System.out.println(+rollNumber +"");
        System.out.println(""+name);
    }
}
public class first{
    student s = new student();
    s.display();
}
 */

class Student{
    static int rollNumber;
    String name ;
    
    void setDetails(){
        rollNumber = 10;
        name = "mahi";
    }
    void display(){
        rollNumber = 66;
        name = "maa";
        
    } 
    void print(){
        System.out.println(""+rollNumber + name );
    }


}
public class first{
    public static void main (String [] args){
        Student sc = new Student();
        sc.setDetails();
        sc.print();
        Student sc1 = new Student();
        sc1.print();

    }
}
