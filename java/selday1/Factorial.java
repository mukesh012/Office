package selday1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int n,factorialResult=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter any Number: ");
		n = input.nextInt();

		for (int i=1;i<=n;i++) {
			factorialResult = factorialResult * i;
		}

		System.out.println("The factorial of entered value is " + factorialResult);
	}
}
