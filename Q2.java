package jibitesh;
import java.util.*;
public class Q2 {
	public static void bodyweight(double a, double b) {
		double bmi = a/(Math.pow(b, 2));
		if(bmi < 18.5 ) {
			System.out.println("underweight");
			
		}
		else if(bmi >= 18.5 && bmi <=24.9 ) {
			System.out.println("Normal weight");
		}
		else if (bmi >= 25.0 && bmi <=29.9  ){
			System.out.println("overweight");
			
		}
		else {
			System.out.println("Obese");
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight:");
		double a = sc.nextDouble();
		System.out.println("Enter the height:");
		double b = sc.nextDouble();
		bodyweight(a,b);
		
		
	}

}
