import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int armstrongNumber = input.nextInt();
        int original = armstrongNumber;
        int digits = 0;
        int sum = 0;
        if(armstrongNumber < 0){
            armstrongNumber *= -1;
        }
        while(armstrongNumber > 0){
            int place = armstrongNumber % 10;
            armstrongNumber -= place;
            armstrongNumber /= 10;
            digits++;
        }
        armstrongNumber = original;
        for(int i = 0; i < digits; i++){
            int place = armstrongNumber % 10;
            armstrongNumber -= place;
            armstrongNumber /= 10;
            sum += (int) Math.pow(place, digits);
        }
        if(sum == original){
            System.out.print("This number is an armstrong number");
        }
        else
        {
            System.out.print("This number is not an armstrong number");
        }
    }


}