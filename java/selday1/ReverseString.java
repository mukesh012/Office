package selday1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, rev=0;
		System.out.println("Enter a number");
		Scanner Number = new Scanner(System.in);
		a=Number.nextInt();
		
while (a!=0)
{
	rev = rev*10;
	rev=rev+a%10;
	a=a/10;
	
	
	}

System.out.println("Reverse of entered number is "+rev);
	}

}
