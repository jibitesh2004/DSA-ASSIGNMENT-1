import java.util.Scanner;

public class H1 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first integer:");
    int a = sc.nextInt();
    System.out.println("Enter the second integer:");
    int b = sc.nextInt();
    System.out.println("Enter the third integer:");
    int c = sc.nextInt();
    if(a + b ==c || a == b - c || a * b == c){
        System.out.println("Yes they can used in the given arithmetic formula");

    }
    else{
        System.out.println("No they can't be used in the given arithmetic formula");
    }
   }

    
    
}
