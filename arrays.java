import java.util.Scanner;
public class arrays{
    /* 
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = sc.nextInt();
        int n[] = new int [size];
        for (int i = 0; i < n.length; i++){
            System.out.println("enter a number :");
            n[i] = sc.nextInt();
        }    
        for(int i = 0; i< n.length;i++ ){
            System.out.println( +n[i] +" ");
        }    


        }
        */
/* 

    public static void main(String [] args){
        int n [] = {1,2,4,5,6};
        for(int i = 0; i<5; i++){
            System.out.println(+n[i]+"");

        }
        for(int x :n){
            System.out.println(x);
        }
        int sum = 0;
        for (int i = 0; i<n.length; i++){
            sum = sum +n[i];
           
        }
        System.out.println(+sum +"");
    }
    }

    */
    /* 
    public static void main(String [] args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size ");
        int size = sc.nextInt();
        int [] n = new int[size];
        for (i = 0 ; i < n.length; i++)
        {
            System.out.println("enter a number ");
            n[i] = sc.nextInt();
        }
        for( i = 0 ; i < n.length; i++)
        {
            System.out.println("" + n[i]);
        }
        
    }

}    
    */

public static void main(String []args){
    int i;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    int [] n = {10,20,30,40,50};
    for(i = 0 ; i < n.length; i++)
    {
        sum = sum +n[i];
        System.out.println(""+n[i]);
    }
    System.out.println(""+sum);
}
}    