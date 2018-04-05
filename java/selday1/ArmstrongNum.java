
package selday1;


public class ArmstrongNum {

	public static void main(String[] args) {
		
		int sum=0,r;
		System.out.print("Armstrong numbers from 100 to 1000:");
		for(int i = 100; i <= 1000; i++)
		{
			 int n = i;
	            while(n > 0)
	            {
	            	r=n%10;
	    			n=n/10;
	    			sum=sum+(r*r*r);
	            }
			
				
			 if(sum == i)
	         {
	             System.out.print(i+ " " );
	         }
			 sum =0;
	        
		}
		
	}

}
