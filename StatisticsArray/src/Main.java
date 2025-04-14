import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        int[] originalArray = new int[arraySize];
        float[] statisticArray = new float[arraySize];
        for(int i = 1; i <= arraySize; i++){
            System.out.print("Enter number " + i + ": ");
            originalArray[i-1] = input.nextInt();
        }
        int sum = 0;
        for(int num: originalArray){
            sum += num;
        }
        double mean = (double) sum / arraySize;
        for(int i = 0; i < arraySize; i++){
            statisticArray[i] = (float) Math.pow((originalArray[i] - mean), 2);
        }
        float variance = 0;
        for(float num: statisticArray){
            variance += num/arraySize;
        }
        float standardDeviation = (float) Math.sqrt(variance);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}