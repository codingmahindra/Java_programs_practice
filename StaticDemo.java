class Student
{
    int m ;
    static int n;
    void setDetails()
    {
        m = 10;
        n = 20;
    }
    void display()
    {
        System.out.println(""+m +" " +n);

    }

}
public class StaticDemo
{
    public static void main(String []args)
    {
        Student s = new Student();
        s.setDetails();
        s.display();
        Student s1 = new Student();
        s1.display();
    }
}
