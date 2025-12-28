class Employee
{
    int empNo;
    String empName;
    Employee(int empNo, String empName){
        this.empNo = empNo;
        this.empName = empName;

    }

void displayEmpDetails(){
    System.out.println(""+empNo);
    System.out.println(""+empName);


   }
}   
public class constructor1{
    public static void main(String []args){
    Employee c = new Employee(66,"mahi");
    c.displayEmpDetails();
}
}






