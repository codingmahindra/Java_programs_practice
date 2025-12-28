
// find the area of rectangle formula ( f =(l*b) )
import java.util.Scanner;

public class scanner {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter lenght of the rectangle");
        int length = s.nextInt();
        System.out.println("enter breadth of the rectangle");
        int breadth = s.nextInt();
        int area = length * breadth;
        System.out.println("the area of rectangle is :"+area);
    
    }
    
}



class Studentdetails{
    public static void main(String [] args){
     Scanner s = new Scanner(System.in);
     System.out.println("enter your name");
     String name = s.next();
     System.out.println("enter your nmber");
     double roll_number = s.nextDouble();
     System.out.println("enter 3 subject marks");
     double marks_sub1 = s.nextDouble();
     double marks_sub2 = s.nextDouble();
     double marks_sub3 = s.nextDouble();
     double total = marks_sub1 + marks_sub2 + marks_sub3;
     double avg = (total/3);
    System.out.println("the student details are :" +"\n"+ name +"\n"+  + roll_number +"\n"+ +marks_sub1 +"\n"+ +marks_sub2 +"\n"+ +marks_sub3 );
    System.out.println("total marks is :" + total);
    System.out.println("average of 3 subjects is " + avg);
    }
}

class Even_number{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x % 2 == 0){
          System.out.println("you entered even number");
        }
        else{
            System.out.println("you entered odd number");
        }
    }
}

class Bigamongthree{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter three values");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        
        /* *
        if(n1>n2 && n1>n3){
            System.out.println(n1+ "is big" );

        }
        else{
            if( n2 > n1 && n2>n3){
                System.out.println("big is"+n2);

            }
            else{
                System.out.println("big is "+ n3);
            }
        }
            */
          

          System.out.println( ( n1>n2 && n2 >n3) ? n1 :(( n2 > n1 && n2 >n3) ? n2 : n3));

 
    }
}

//switch
class Calculator{
    public static void main( String [] args){
        int res = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two values");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("\n"  +"1.Addition" + "\n"+" 2.subtraction" +"\n" +  "3.multiplication" + "\n"+ "4.division");
        System.out.println("enter your choice");
        int ch = sc.nextInt();
        switch(ch){
            case 1 :res = n1 + n2; break;
            case 2 :res = n1 - n2 ; break;
            case 3: res = n1*n2; break;
            case 4 :res =n1 /n2; break;
            case 5: res = n1 % n2; break;
            default : System.out.println("you enterd invalid option ");
        }
        System.out.println( "result is : "+ res );
    }
}

