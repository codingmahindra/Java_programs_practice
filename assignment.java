class Student{
    int rollNumber;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;
void setStudentDetails(){
    rollNumber = 66;
    name = "mahi";
    mark1 = 99;
    mark2 = 98;
    mark3 = 97;

}    
void calculateTotal(){

    totalMarks = mark1+mark2+mark3;
}
void displayStudentDetails(){
    System.out.println(""+rollNumber);
    System.out.println(""+name);
    System.out.println(""+ totalMarks);
}
}

public class assignment{
    public static void main(String[]args){
        Student s = new Student();
        s.setStudentDetails();
        s.calculateTotal();
        s.displayStudentDetails();


    }

}