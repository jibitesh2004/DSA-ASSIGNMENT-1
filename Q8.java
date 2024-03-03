import java.util.Scanner;

public class Q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int d = sc.nextInt();
        System.out.println("Enter the no of column:");
        int e = sc.nextInt();


        
        System.out.println("Enter the elements of the array:");
        int marks[][] = new int[d][e];
       

        for(int i = 0; i<marks.length; i++){
            for(int j = 0; j<marks[0].length; j++){
            marks[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println("The elements of the 2D array are:");
        for(int i = 0; i<d; i++){
            for(int j =0; j<e; j++ ){
                System.out.print(marks[i][j] + " ");
                sum+=marks[i][j];



            }
            System.out.println();
           
        }
        System.out.println("The sum of elements of the 2D-Array is "+ sum);

    }
    
    
}
