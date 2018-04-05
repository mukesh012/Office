package selday1;

import java.util.Scanner;

public class IfelsefizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter upper boundry and lower bowndry:");
		a = number.nextInt();
		b = number.nextInt();

		for(int i=a;i<=b;i++){
			if(i%5 == 0 && i%3 ==0){
				System.out.println("FizzBuzz" +"\t");

			} 
			else if(i%3 == 0){
				System.out.println("Fizz" +"\t");


			} 
			else if(i%5 == 0){
				System.out.println("Buzz" +"\t");
			} 
			else {
				System.out.println(i +"\t");
			}
		}
	}




}
