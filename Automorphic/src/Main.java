import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        int digits = DigitCounter(number);
        int[] lastNum = NumberSeparator(number, digits);
        int powNumber = (int) Math.pow(number, 2);
        int powDigits = DigitCounter(powNumber);
        int[] powNum = NumberSeparator(powNumber, powDigits);
        int count = 0;
        int iterator = digits - 1;
        boolean equal = false;
        for(int i = powDigits - 1; i > powDigits - digits - 1; i--){
            if(powNum[i] == lastNum[iterator]){
                count++;
            }
            if(count == digits){
                equal = true;
            }
            iterator--;
        }
        if(equal){
            System.out.print("This number is Automorphic");
        }
        else{
            System.out.print("this number is not Automorphic");
        }
    }
    public static int DigitCounter(int num)
    {
        int digits = 0;
        while(num > 0){
            int place = num % 10;
            num -= place;
            num /= 10;
            digits++;
        }
        return digits;
    }
    public static int[] NumberSeparator(int num, int digits) {
        int[] array = new int[digits];
        for (int i = digits - 1; i >= 0; i--) {
            int place = num % 10;
            num -= place;
            num /= 10;
            array[i] = place;
        }
        return array;
    }
}