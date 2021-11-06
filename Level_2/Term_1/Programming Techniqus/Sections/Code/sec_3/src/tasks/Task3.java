package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Variables
        String word;

        // Read the word from user
        System.out.print("Enter the word: ");
        word = new Scanner(System.in).next();

        // Check word
        if (word.length() > 10) {
            // print short cut
            System.out.println("The shortcut for \"" + word + "\" are "
                    + (word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1)));
        } else {
            System.out.println("word = " + word);
        }

        // bonus - number of characters
        System.out.println("-------------- Bonus --------------");
        word = word.toUpperCase();
        int[][] numOfCharacters = new int[getRealLength(word)][2];

        for (int i = 0; i < numOfCharacters.length; i++) {
            numOfCharacters[i][0] = word.charAt(0);
            numOfCharacters[i][1] = getNumOfCharacters(word, word.charAt(0));
            word = word.replaceAll(String.valueOf(word.charAt(0)), "");
        }

        // print
        for (int i = 0; i < numOfCharacters.length; i++) {
            System.out.print((char)numOfCharacters[i][0] + " : " + numOfCharacters[i][1] + "\t");
            if (i % 2 == 1)
                System.out.println();
        }
    }

    private static int getRealLength(String word) {
        int length = 0;
        ArrayList<Character> temp = new ArrayList<>();
        boolean isIn = false;
        for (int i = 0; i < word.length(); i++) {
            if (temp.size() > 0) {
                for (Character character : temp)
                    if (word.charAt(i) == character) {
                        isIn = true;
                        break;
                    }
            }
            // Add
            temp.add(word.charAt(i));
            if (!isIn) {
                length++;
            }
            isIn = false;
        }
        return length;
    }

    private static int getNumOfCharacters(String word, char character) {
        int num = 0;
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == character)
                num++;
        return num;
    }
}
