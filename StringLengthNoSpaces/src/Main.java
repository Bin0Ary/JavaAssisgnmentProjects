import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = input.nextLine();
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != ' '){
                count++;
            }
        }
        System.out.print("String length without spaces: " + count);
    }
}