//Write a program to check if a number is greater than 10.
package Numbers;

import java.util.Scanner;

public class Greater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int Num=sc.nextInt();
		if(Num>10) {
			System.out.println("The given number is greater than 10 .");
		}
		else {
			System.out.println("The given number is less than 10 . ");
		}
	}
}
