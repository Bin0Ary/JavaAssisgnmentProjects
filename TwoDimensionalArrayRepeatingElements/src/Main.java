
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int rowSize = input.nextInt();
        System.out.print("Enter column: ");
        int columnSize = input.nextInt();
        int[][] array = new int[rowSize][columnSize];
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                System.out.print("Enter number: ");
                array[i][j] = input.nextInt();
            }
        }
        int iterator = 0;
        int[] counted = new int[rowSize*columnSize];
        boolean alreadyCounted;
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < columnSize; j++){
                alreadyCounted = false;
                for(int num: counted){
                    if(num == array[i][j]){
                        alreadyCounted = true;
                        break;
                    }
                }
                if(!alreadyCounted){
                    int count = 0;
                    for(int[] row: array){
                        for(int column: row){
                            if(column == array[i][j]){
                                count++;
                            }
                        }
                    }
                    System.out.println(array[i][j] + ":" + count);
                    counted[iterator] = array[i][j];
                    iterator++;
                }
            }
        }
    }
}