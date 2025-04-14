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
        int greatest = 0;
        int smallest = 0;
        for(int num: array){
            if(num > greatest)
                greatest = num;
        }
        for(int num: array){
            if(num < smallest)
                smallest = num;
        }
        System.out.println("Greatest Number: " + greatest + "\n" + "Smallest Number: " + smallest);
    }
}