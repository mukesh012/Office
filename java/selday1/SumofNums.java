package selday1;

import java.util.Scanner;

public class SumofNums {

	public static void main(String[] args) {
		
		int getNumber;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any getNumber: ");
		getNumber = sc.nextInt();
		int temp = getNumber;
		int r,sum=0;	
		while (getNumber!=0)
		{
			r=getNumber%10;
			sum=sum+getNumber;
			getNumber=getNumber/10;
			sc.close();
		}
System.out.println("Sum=" +sum);
	}

}
