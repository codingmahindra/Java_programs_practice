import java.util.Scanner;
public class whileloop{
    public static void main(String[] args ){
        int n , sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter the numbers except zero");
             n = sc.nextInt();
            if (n == 0){
                break;
            }
            else{
                sum += n;
            }
        }
        System.out.println("the sum of your enter numbers is" +sum);


    }
}