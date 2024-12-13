package Numbers;
import java.util.Scanner;
public class greatestoftwo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b) {
        System.out.println(a + " is the largest.");
    } 
    else{
        System.out.println(b+"  is large");
    }
    }
}
