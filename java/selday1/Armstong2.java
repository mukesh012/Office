
package selday1;

import java.util.Scanner;

public class Armstong2 {

	public static void main(String[] args) {
		
		
		
        int r,sum=0;	
		
		for(int i = 100; i <= 1000; i++)
		{
			int n=i;
		
		while (n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);	
		}
		
		if (sum==i) 
		{
System.out.println(i+ " ");
	}
		sum=0;
		}
	}
}
