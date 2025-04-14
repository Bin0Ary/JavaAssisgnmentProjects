import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rowSize = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columnSize = input.nextInt();
        int[][] matrix = new int[rowSize][columnSize];
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                System.out.print("Enter num: ");
                matrix[i][j] = input.nextInt();
            }
        }
        int[][] transposedMatrix = new int[columnSize][rowSize];
        for(int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Displaying matrix: ");
        for(int[] row:matrix){
            for(int column:row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("Displaying transposed matrix: ");
        for(int[] row:transposedMatrix){
            for(int column:row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}