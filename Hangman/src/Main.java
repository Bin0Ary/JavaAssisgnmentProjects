import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Hangman hangman = new Hangman();
        System.out.println("The category is animals!");
        if(hangman.Run()){
            System.out.println("The word was: " + hangman.getChosenWord());
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
    }
}
class Letter{
    char aChar;
    Letter(){
        aChar = '_';
    }
}
class Hangman{
    private String chosenWord;
    private final Letter[] letters;
    private int wordLength;

    Hangman(){
        RandomWord();
        letters = new Letter[wordLength];
        for(int i = 0; i < wordLength; i++){
            letters[i] = new Letter();
        }
    }
    private void RandomWord(){
        String[] words = {"Giraffe", "Leopard", "Octopus", "Buffalo", "Panther", "Ocelot", "Gazelle", "Wombat", "Jaguar", "Lobster", "Meerkat", "Narwhal", "Alpaca", "Cheetah", "Donkey", "Jackal", "Manatee", "Badger", "Tarantula", "Platypus", "Hamster", "Parrot", "Reindeer", "Seahorse", "Alligator", "Scorpion", "Armadillo", "Elephant", "Gorilla", "Raccoon", "Antelope", "Chimpanzee", "Firefly", "Flamingo", "Hedgehog", "Kangaroo", "Koala", "Lemur", "Pelican", "Porcupine", "Starfish", "Tortoise", "Walrus", "Weasel", "Woodpecker", "Butterfly", "Caterpillar", "Crocodile", "Sloth", "Squirrel"};
        Random g = new Random();
        int index =  g.nextInt((49) + 1);
        chosenWord = words[index].toLowerCase();
        wordLength=chosenWord.length();
    }
    public boolean Run(){
        int tries = wordLength + 2;
       char[] charWord = chosenWord.toCharArray();
       Scanner scanner = new Scanner(System.in);
       boolean win = false;
       int counter = 0;
       int lettersLeft = wordLength;
       while(true) {
           if(tries == 0){
               break;
           }
           for(Letter l:letters){
               System.out.print(l.aChar + " ");
           }
           System.out.println("\nTries: " + tries);
           System.out.print("Enter your guess: ");
           char guess = scanner.next().charAt(0);
           if(!doesItContain(guess)){
           for(int i = 0; i < wordLength; i++){
               if(guess == charWord[i]){
                   letters[i].aChar = guess;
                   counter++;
                   lettersLeft--;
               }
           }
           if(counter == 0){
               tries--;
           }
           else{
               counter = 0;
           }
           if(lettersLeft == 0){
               win = true;
               break;
           }

       }
           else{
               System.out.println("You already guessed this letter!");
           }
           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
       return win;
    }
    public String getChosenWord(){
        return chosenWord;
    }
    public boolean doesItContain(char c){
        for(Letter l: letters){
            if(c == l.aChar){
                return true;
            }
        }
        return false;
    }

}