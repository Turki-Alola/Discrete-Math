package CS285.A2;

import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
        String word;
        System.out.println("To exit the program enter -1 ");
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("\nEnter a String you want to be counted ");
            word = s.nextLine();
            if (word.equals("-1")) {
                break;
            }
            System.out.println("\nThe length of " + "\"" + word + "\" is: " + countChar(word));
        }
    }

    public static int countChar(String word) {
        // base case,the <= is a saftey measure incase it skips 1 for one reason or another
        if (word.length() <= 1) {
            // returns 1 for the last char    
            return 1;
        } else {
            // keeps calling till the base case is reached
            return countChar(word.substring(0, word.length() - 1)) + 1;
        }
    }

}
