package selday1;

import java.util.Scanner;

public class AritmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int result = 0;

		Scanner value = new Scanner(System.in);
		System.out.print("Enter a and b numbers: ");
		num1 = value.nextInt();
		num2 =value.nextInt(); 
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = value.next().charAt(0);
		switch(operator)
		{
		case '+':
			result  = num1+num2;
			break;

		case '-':
			result  = num1-num2;
			break;

		case '/':
			result  = num1/num2;
			break;

		case '*':
			result  = num1*num2;
			break;

		default:
			System.out.printf("Error! operator is not correct");
		}
		System.out.println("Result=" +result);
	}



}

