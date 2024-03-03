package jibitesh;

import java.util.Scanner;

public class Q5 {
	public static int sumofdigit(int n) 
	{
		int sum = 0;
		while(n>9) 
		{
			sum = 0;
			while(n>0) 
			{
				int lastdigit = n%10;
				sum+=lastdigit;
				n/=10;
				
			}
			//System.out.println(n);
			//System.out.println(sum);
			n=sum;
		}
		return sum;
	    
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		System.out.println(sumofdigit(a));
	}

}
