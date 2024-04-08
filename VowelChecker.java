import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (isVowel(inputChar) == 1) {
            System.out.println(inputChar + " is a vowel.");
        } else {
            System.out.println(inputChar + " is a consonant.");
        }

        scanner.close();
    }

    // User Defined Method to check if a character is a vowel
    public static int isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (char vowel : vowels) {
            if (ch == vowel) {
                return 1; // Character is a vowel
            }
        }

        return 0; // Character is a consonant
    }
}