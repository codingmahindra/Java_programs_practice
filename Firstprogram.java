/* 

class Firstprogram{
    public static void main(String[] args){
        System.out.println("helloworld");
    }
}
class Secondprogram{
    public static void main(String [] agrs ){
        System.out.println("secondprogram");

    }
}
class Thirdprogram{
    public static void main(String[] args){
        System.out.println("third program");
    }

}

class Total{
    public static void main(String [] args){
        int a = 400;
        System.out.println("the total score"+ a);

    }
}

class Sample {
    int m;

    void run(){
        int n = 20;
        System.out.println(""+n);
    }
    public static void main( String [] args){
        Sample s = new Sample();
        System.out.println(s.m);
        s.run();
    }
} */

// do while application (Banking problem)
import java.util.Scanner;

class Firstprogram {
    /**
     * @param args
     */
    public static void main(String[]args){
    int c,d,w,b,ch;
    Scanner s = new Scanner(System.in);
    System.out.println("enter current balance");
    c = s.nextInt();
    do {
       System.out.println("\n 1.deposit \n 2.withdraw \n 3.current balance \n 4.exit ");
       System.out.println("enter your option");
       ch = s.nextInt();
       switch(ch){
        case 1 : System.out.println("your current balance is "+c);
                 System.out.println("enter deposit balance ");
                 d = s.nextInt();
                 c = c+d;
                 System.out.println("your current balance is "+c);
                 break;
        case 2: System.out.println("your current balance is "+c);
                System.out.println("enter your withdrawl amount is ");
                w = s.nextInt();
                c = c -w;
                System.out.println("your remaing amount is "+c);
                break;
        default:
        System.out.println();
       }
    while(ch !=4);   
    }
}
}   

    


