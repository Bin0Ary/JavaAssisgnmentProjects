import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        if(Math.sqrt(number) == Math.floor(Math.sqrt(number))){
            System.out.print("This number is a full square");
        }
        else {
            System.out.print("this number is not a full square");
        }

    }
}