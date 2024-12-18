//Calculate the sum of two given numbers and check if the result is odd.
package Numbers;

import java.util.Scanner;

public class Sumoftwo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number :- ");
		int a=sc.nextInt();
		System.out.println("Enter a Second Number :- ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("The sum of Given Numbers Is :"+(sum));
		if(sum%2!=0) {
			System.out.println("The result is odd");
		}
		else {
			System.out.println("The result is even ");
		}
		

	}
}
