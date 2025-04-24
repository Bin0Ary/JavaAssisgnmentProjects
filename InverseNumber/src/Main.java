
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if(num < 0){
            num *= -1;
        }
        while(num > 0){
            int place = num % 10;
            num -= place;
            num /= 10;
            System.out.print(place);
        }
    }
}