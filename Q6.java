import java.util.*;
public class Q6{
    public static boolean isOdd(int a){
        int b = a & 1;
        if(b == 0){
           return true;
        }
        return false;
        // else{
        //     System.out.println("Odd");
        // }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a = sc.nextInt();
        boolean c = isOdd(a);
        if(c == true){
            System.out.println("Even");
        }
         else{
            System.out.println("Odd");
        }
        
    }
}