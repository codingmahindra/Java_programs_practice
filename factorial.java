/* 
import java.util.Scanner;

public class factorial{

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int f =1;
        int i;
        for(i = n ; i > 0 ; i--){

            f = f*i;    
        }
        System.out.println("the factorial of number " + n + " is  " + f );

    }
}

*/

// by using functions 
import java.util.Scanner;
public class factorial{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int f = fact (n);
        System.out.println("the factorial of a number is " +n+ "is " +f);
    }


    static int fact(int n){
    int f = 1;
    int i ;
    for ( i = n; i>0; i--){
        f =f*i;
    }
    return f;
}   
}

