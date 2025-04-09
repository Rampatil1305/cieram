import java.util.Scanner;
public class largest{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        
        if(a >= b && a >= c){
            System.out.println("The largest number is: " + a);
        } else if(b >= a && b >= c){
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
            System.out,println("it is in the master branch");
        }

    }
}