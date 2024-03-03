package jibitesh;
import java.util.*;
public class Q3 {
	public static void spy(int a ) {
//		int b = a;
		int sum = 0;
		int product = 1;
		while(a>0) {
			int lastdigit = a % 10;
			sum +=lastdigit;
			product*=lastdigit;
			a/=10;
			
			
		}
//		System.out.println(sum + product);
		
		if(sum == product) {
			System.out.println("It is Spy number");
		}
		else {
			System.out.println("No it is not a spy number");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int a = sc.nextInt();
		spy(a);
	}

}
