import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 1; i <= arraySize; i++) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = input.nextInt();
        }
        System.out.print("Enter shift amount: ");
        int shiftAmount = input.nextInt();
        int[] storage = new int[shiftAmount];
        for(int i = 0; i < shiftAmount; i++){
            storage[i] = numbers[i];
        }
        for(int i = 0; i < shiftAmount; i++) {
            for (int j = 0; j < arraySize - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
        }
        int iterator = shiftAmount - 1;
        for(int i = arraySize - 1; i > arraySize - shiftAmount - 1; i--){
            numbers[i] = storage[iterator];
            iterator--;
        }

        for(int num: numbers){
            System.out.print(num + " ");
        }
    }
}