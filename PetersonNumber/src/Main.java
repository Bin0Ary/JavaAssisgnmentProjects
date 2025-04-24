import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int petersonNumber = input.nextInt();
        int original = petersonNumber;
        int sum = 0;
        if(petersonNumber < 0){
            petersonNumber *= -1;
        }
        while(petersonNumber > 0){
            int place = petersonNumber % 10;
            petersonNumber -= place;
            petersonNumber /= 10;
            sum +=  Fact(place);
        }
        if(sum == original){
            System.out.print("This number is a peterson number");
        }
        else
        {
            System.out.print("This number is not a peterson number");
        }
    }
    public static int Fact(int num){
        if(num <= 1)
            return 1;
        return num = num * Fact(num - 1);
    }

}