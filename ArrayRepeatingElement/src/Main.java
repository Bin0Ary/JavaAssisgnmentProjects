
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
        for(int num: numbers) {
            alreadyCounted = false;
            for (int counted : countedNumbers) {
                if (num == counted) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                int count = 0;
                for (int num1 : numbers) {
                    if(num == num1){
                        count++;
                    }
                }
                count -= 1;
                System.out.println(num + ":" + count);
                count = 0;
                countedNumbers[countIteration] = num;
                countIteration++;

            }
        }
    }
}
