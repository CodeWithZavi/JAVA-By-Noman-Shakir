import java.util.Scanner;

public class AddMatrixOf2x3 {
    
    public static void main(String[] args) {
        Input cal = new Input();
        int[][] matrix1 = cal.input(2, 3);
        int[][] matrix2 = cal.input(2, 3);
        int[][] result = cal.sum(matrix1, matrix2);
        
        System.out.println("Matrix 1:");
        cal.print(matrix1);
        System.out.println("\nMatrix 2:");
        cal.print(matrix2);
        System.out.println("\nSum of Matrices:");
        cal.print(result);
    }
}

class Input {
    public int[][] input(int row, int col) {
        int[][] arr = new int[row][col];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
    
    public int[][] sum(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] result = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
