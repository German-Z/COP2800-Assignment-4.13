import java.util.*;

public class LetterCheck {
    public static void main(String[] args) {
        //Instantiate scanner input class
        Scanner input = new Scanner(System.in);
        // Prompt user to enter a letter
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char userLetter = letter.charAt(0);
        // check if input is valid
        if (letter.length() > 1 || !Character.isLetter(userLetter)) {
            System.out.printf("%s is an invalid input. Please enter a letter (e.g. C).\n", letter);
            System.out.println("The program will now exit");
            input.close();
            return;
        }
        // use switch statment for vowels and default for consonant
        switch (letter) {
            case "A": 
            case "E":
            case "I": 
            case "O":
            case "U":
            case "a":
            case "e": 
            case "i":
            case "o": 
            case "u":
            //Display results for vowels
                System.out.printf("%s is a vowel.\n", letter);
                System.out.println("Try again to check other letters.");
                break;
            default: 
            //Display results for consonant
                System.out.printf("%s is a consonant.\n", letter);
                System.out.println("Try again to check other letters.");
        }
        input.close();
    }
}
