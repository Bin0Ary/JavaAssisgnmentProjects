import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nThBiggestNumber = 0;
        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        for(int i = 1; i <= arraySize; i++) {
            System.out.print("Enter number " + i + ": ");
            array[i - 1] = input.nextInt();
        }
        while(true) {
            System.out.println("Enter the Nth biggest number: ");
            nThBiggestNumber = input.nextInt() - 1;
            if (nThBiggestNumber > arraySize) {
                System.out.println("Input out of range, try again!");
            } else {
                break;
            }
        }
        for (int i = 0; i < arraySize - 1; i++)
            for (int j = 0; j < arraySize - i - 1; j++)
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        System.out.println("Nth biggest number: " + array[nThBiggestNumber]);

    }
}