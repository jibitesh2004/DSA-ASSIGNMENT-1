import java.util.*;
public class Q6{
    public static boolean isOdd(int a){
       int bitmask = a & 1;
        if(a != 1){
            return false;
        }
        return true;

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
