import java.util.Scanner;

public class H4 {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int row = a.length;
        int column = a[0].length;
        double[][] result = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: both matrix dimension should be same so just write first matrix dimension and the same will be executed for matrix 2");
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();

        double[][] matrix1 = new double[row][column];
        double[][] matrix2 = new double[row][column];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = sc.nextDouble();
            }
        }

        double[][] resultMatrix = addMatrix(matrix1, matrix2);

        System.out.println("\nResultant matrix (sum of matrices):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
