import java.util.*;
public class Q1 {
	public static int repeat(int n) {
		int m = n;
		
		
		int count = 0;
		while(n >2) {
		   n/=2;
		   count++;
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = repeat(a);
		System.out.println(b);
	}

}
