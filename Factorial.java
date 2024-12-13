package Numbers;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int fact = 1;
        
        // Calculate the factorial
        for (int i = 1; i <= num; i++) {
            fact *= i;  // Corrected line, multiplying instead of adding
        }
        
        System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();  // Closing the scanner resource
    }
}
      