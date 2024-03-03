import java.util.*;
public class Q10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:  ");
        double marks[][] = new double[3][4];
        for(int i = 0; i<marks.length; i++){
            for(int j = 0; j<marks[0].length; j++){
                marks[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for(int j = 0; j<marks[0].length; j++){
            sum=0;
            for(int i = 0; i<marks.length; i++){
                sum+=marks[i][j];
            }
            System.out.println("Sum of the elements at column "+ j +" is " + sum);
        }

        

    }
    
}
