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
        int countIteration = 0;
        int[] countedNumbers = new int[arraySize];
        boolean alreadyCounted;
        for (int num : numbers) {
            alreadyCounted = false;
            for (int counted : countedNumbers) {
                if (num == counted) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                countedNumbers[countIteration] = num;
                countIteration++;

            }
        }
        int iterator = 0;
        int[] copiedNumberArray = new int[countedNumbers.length];
        for(int i = 0; i < copiedNumberArray.length; i += 2){
            for(int j = 0; j < 2; j++){
                copiedNumberArray[i+j] = countedNumbers[iterator];
            }
            iterator++;
        }
        for(int num : copiedNumberArray){
            System.out.println((num));
        }
    }
}