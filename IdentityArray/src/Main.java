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
        boolean isRestZero = false;
        boolean isDiagonalOne = false;
        int count = 0;
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                if(i == j && matrix[i][j] == 1){
                    count++;
                }
            }
        }
       if(count == rowSize){
           isDiagonalOne = true;
       }
        count = 0;
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                if(matrix[i][j] != 0){
                    count++;
                }
            }
        }
        if(count == rowSize){
            isRestZero = true;
        }
        if(isRestZero && isDiagonalOne){
            System.out.println("The matrix is an identity matrix");
        }
        else{
            System.out.println("The matrix is not an identity matrix");
        }
    }
}