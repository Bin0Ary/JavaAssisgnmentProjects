import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        for(int i = 1; i <= arraySize; i++) {
            System.out.print("Enter number " + i + ": ");
            array[i - 1] = input.nextInt();
        }
        for (int i = 0; i < arraySize - 1; i++)
            for (int j = 0; j < arraySize - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        for(int num: array){
            System.out.print(num + " ");
        }
    }
}