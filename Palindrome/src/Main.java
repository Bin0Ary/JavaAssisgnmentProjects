import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        int original = number;
        int digits = 0;
        while(number > 0){
            int place = number % 10;
            number -= place;
            number /= 10;
            digits++;
        }
        number = original;
        int[] numberArray = new int[digits];
        for(int i = digits - 1; i >= 0; i-- ){
            int place = number % 10;
            number -= place;
            number /= 10;
            numberArray[i] = place;
        }
        number = original;
        int[] palindromeNumberArray = new int[digits];
        for(int i = 0; i < digits; i++ ){
            int place = number % 10;
            number -= place;
            number /= 10;
            palindromeNumberArray[i] = place;
        }
        int count = 0;
        for(int i = 0; i < digits; i++){
            if(numberArray[i] == palindromeNumberArray[i])
                count++;
        }
        if(count == digits){
            System.out.print("This number is a palindrome");
        }
        else{
            System.out.print("This number is not a palindrome");
        }
    }
}