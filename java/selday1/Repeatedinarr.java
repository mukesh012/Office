package selday1;

public class Repeatedinarr {
	
	void printRepeat(int a[],int size)
	{     
		int i,j;
		System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++) 
    {
        for (j = i + 1; j < size; j++) 
        {
            if (a[i] == a[j]) 
                System.out.print(a[i] + " ");
        }
    }
    }

	public static void main(String[] args) {
	   
		Repeatedinarr repeat = new Repeatedinarr();
		int []a = {13,15,67,88,65,13,99,67,65,87,13};
		int a_size = a.length;
		 repeat.printRepeat(a, a_size);
	}

}
