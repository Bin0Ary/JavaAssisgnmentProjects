import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        StringBuilder string = new StringBuilder(input.nextLine());
        System.out.print("Enter your reversed string: ");
        StringBuilder reversedString = new StringBuilder(input.nextLine());
        if (string.toString().equals(reversedString.reverse().toString())) {
            System.out.print("The strings are the reverse of each other");
        }
        else
        {
            System.out.print("The strings are not the reverse of each other");
        }


    }
}