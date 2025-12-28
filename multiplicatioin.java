import java.util.Scanner;
public class multiplicatioin{
    /* 
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = 1;i<=10;i++){
            int p = n*i;
            System.out.println(n+ "*"+i+ "=" +p );
        }
    }
    */

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i =1;
        while (i<10){
            if (i == 5){
                i++;
                continue;
            }
            else{    
                System.out.println(i+"");
                i++;
        }
    } 
}
}