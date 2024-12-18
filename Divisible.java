//Write a program to check if a number is divisible by 5.
package Numbers;

import java.util.Scanner;

public class Divisible {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num =sc.nextInt();
	if(num%5==0) {
		System.out.println("Given Number is Divisible By 5");
	}
	else {
	System.out.println("Given Number is Not Divisible by 5");	
	}
}
}
