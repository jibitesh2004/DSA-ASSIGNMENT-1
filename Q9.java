import java.util.*;
public class Q9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the 4x4 matrix:");
        double marks[][] = new double[4][4];
        for(int i = 0; i<marks.length; i++){
            for(int j = 0; j<marks[0].length; j++){
                marks[i][j] = sc.nextDouble();

            }
        }
        // for(int i = 0; i<marks.length; i++){
        //     for(int j = 0; j<marks[0].length; j++){
        //         System.out.print(marks[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        double sum = 0;
        for(int i = 0; i<marks.length; i++){
            for(int j = 0; j<marks[0].length; j++){
                if(i == j){
                   sum+=marks[i][j];
                }

            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sum);
        
           
    }

    
}
