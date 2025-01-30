import java.util.Scanner;

public class Matrix2D{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int colmns = scanner.nextInt();
        int[][] matrixA = new int[rows][colmns];
        int[][] matrixB = new int[rows][colmns];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colmns; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colmns; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        int[][] sumMatrix=new int[rows][colmns];
        System.out.println("matrix addition result");
        for(int i=0;i<rows;i++){
            for(int j=0;i<colmns;j++){
            sumMatrix[i][j]=matrixA[i][j]+matrixB[i][j];
            System.err.println(sumMatrix[i][j]);
            }
        }
        int[][] diffMatrix=new int[rows][colmns];
        System.out.println("matrix addition result");
        for(int i=0;i<rows;i++){
            for(int j=0;i<colmns;j++){
            diffMatrix[i][j]=matrixA[i][j]-matrixB[i][j];
            System.err.println(diffMatrix[i][j]);
            }
        }
        scanner.close();
    }
}
    
    

    

