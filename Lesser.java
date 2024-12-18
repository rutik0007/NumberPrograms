//Write a program to check if a number is less than 50.
package Numbers;

import java.util.Scanner;

public class Lesser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int Num=sc.nextInt();
		if(Num<50) {
			System.out.println("The given number is Less than 50 .");
		}
		else {
			System.out.println("The given number is Greater than 50 . ");
		}
	}
}
