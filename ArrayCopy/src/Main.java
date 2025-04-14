import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = input.nextInt();
        int[] firstArray = new int[arraySize];
        int[] secondArray = new int[arraySize];
        for(int i = 1; i <= arraySize; i++) {
            System.out.print("Enter number " + i + ": ");
            firstArray[i-1] = input.nextInt();
        }
        secondArray = firstArray;
        for(int i: secondArray){
            System.out.print(i + " ");
        }
    }
}