import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = input.nextLine();
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(string);
        System.out.print(reverseString.reverse());

    }
}