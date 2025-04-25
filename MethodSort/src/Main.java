
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        for(int i = 1; i <= arraySize; i++){
            System.out.print("Enter number " + i + ": ");
            array[i-1] = input.nextInt();
        }
        ArraySort(array);
        for(int num : array){
            System.out.print(num + " ");
        }
    }

    public static void ArraySort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}