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
        System.out.println("Printing Even indices: ");
        for(int i = 0; i < arraySize; i += 2){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nPrinting Odd indices: ");
        for(int i = 1; i <= arraySize; i += 2){
            System.out.print(array[i] + " ");
        }
    }
}