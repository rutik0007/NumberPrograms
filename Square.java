// Write a program to calculate the square of a number.
package Numbers;

import java.util.Scanner;

public class Square {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number : ");
	int Num=sc.nextInt();
	System.out.println("Square of "+ Num + " Is " +Num*Num);
}
}

