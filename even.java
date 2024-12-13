//Check if a number is even or odd
package Numbers;
import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if (num%2==0) {
            System.out.println("The given number is even Number ");
        }
        else{
            System.out.println("The Given Number is Odd");
        }
    }
}
