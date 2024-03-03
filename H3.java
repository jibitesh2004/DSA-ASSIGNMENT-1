import java.util.*;
public class H3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the first array:");
        int a[] = new int[n];
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the second array:");
        int b[] = new int[n];
        for(int i = 0; i<b.length; i++){
            b[i] = sc.nextInt();
        }
        int c[] = new int[n];
        for(int i = 0; i<c.length; i++){
            c[i] = a[i] * b[i];
        }
        System.out.print("The dot product of a and b is: ");
        for(int i = 0; i<c.length; i++){
            System.out.print( c[i] + " ");
        }
}        

    }
    

