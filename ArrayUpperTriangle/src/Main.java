import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rowSize = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columnSize = input.nextInt();
        int[][] matrix = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print("Enter num: ");
                matrix[i][j] = input.nextInt();
            }
        }
        int expectedAmount = 0;
        for(int i = 0; i < rowSize - 1; i++){
            expectedAmount += i + 1;
        }
        int countILessThanJ = 0;
        int countIMoreThanJ = 0;
        int diagonalCount = 0;
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j ++){
                if(i > j && matrix[i][j] != 0){
                    countIMoreThanJ++;
                }
                if(i == j && matrix[i][j] != 0){
                    diagonalCount++;
                }
                if(i < j && matrix[i][j] == 0){
                    countILessThanJ++;
                }
            }
        }
        boolean iMoreThanJIsNotZero = false;
        boolean diagonalIsNotZero = false;
        boolean iLessThanJIsZero = false;
        if(countIMoreThanJ == expectedAmount){
            iMoreThanJIsNotZero = true;
        }
        if(diagonalCount == rowSize){
            diagonalIsNotZero = true;
        }
        if(countILessThanJ == expectedAmount){
            iLessThanJIsZero = true;
        }
        if(iLessThanJIsZero && diagonalIsNotZero && iMoreThanJIsNotZero){
            System.out.println("This matrix is an upper triangle matrix");
        }
        else {
            System.out.println("This matrix is not an upper triangle matrix");

        }
    }
}