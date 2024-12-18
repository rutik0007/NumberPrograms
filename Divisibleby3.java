// Determine the remainder when a number is divided by 3.
package Numbers;

import java.util.Scanner;

public class Divisibleby3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int Num=sc.nextInt();
		if(Num%3==0) {
			System.out.println("The given number is divisible by three and remender is :"+ (Num/3));
		}
		else {
			System.out.println("The given number is not divisible by three ");
		}
	}
}
