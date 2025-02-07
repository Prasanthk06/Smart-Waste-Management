import java.util.*;
public class MatrixMul {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter dimensions of Matrix A (rows and columns): ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat1[][] = new int[m][n];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter dimensions of Matrix B (rows and columns): ");
        int n2 = sc.nextInt();
        int p = sc.nextInt();

        if (n != n2) {
            System.out.println("Matrix Multiplication is not possible");
            return;
        }

        int mat2[][] = new int[n2][p];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter threshold value: ");
        int threshold = sc.nextInt();

        // Perform matrix multiplication
        int mat3[][] = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) 
                System.out.print(mat1[i][j]+" ");
                System.out.println();
        }
        System.out.println("Matrix B:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) 
                System.out.print(mat2[i][j]+" ");
                System.out.println();
        }
        
        System.out.println("\nResulting Matrix C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) 
                System.out.print(mat3[i][j]+" ");
                System.out.println();
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                if (mat3[i][j] > threshold) {
                    mat3[i][j] = threshold;
                }
            }
        }
        System.out.println("After applying threshold:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) 
                System.out.print(mat3[i][j]+" ");
                System.out.println();
        }
    }
    }

        
    


        