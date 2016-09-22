package lab03;

/**
 * Reads in a string and manipulates it using methods from the String class.
 * 
 * @author ASandack
 */

import java.util.Scanner;

public class StringManip
   {
      /**
       * Manipulates strings in various ways and prints the results.
       * 
       * @param args
       */

      public static void main(String[] args)
         {
            String phrase = new String("Change is inevitable ");
            String phraseEnding;
            String longPhrase;
            String change1, change2, change3;

            Scanner scan = new Scanner(System.in);

            System.out.println();
            System.out.println(phrase + " ...");

            // Prompt the user to enter an ending for the phrase
            System.out.print("Enter a phrase ending: ");
            phraseEnding = scan.nextLine();

            // *** Read in the phrase and store it in the phraseEnding variable
            // - use the nextLine method from the scanner class

            // *** Concatenate phrase with phraseEnding using the concat
            // method - store the result in longPhrase
            longPhrase = phrase.concat(phraseEnding);

            // *** Assign change1 to be phraseEnding in all uppercase
            change1 = phraseEnding.toUpperCase();

            // *** Assign change2 to be the longPhrase with all blank
            // characters replaced by asterisks *
            change2 = longPhrase.replaceAll(" ", "*");

            // *** Assign change3 to be the substring of change1 consisting
            // of the first 5 characters
            change3 = change1.substring(0, 5);

            // Print the results
            System.out.println("Long phrase: " + longPhrase);
            System.out.println("Phrase ending: " + phraseEnding);
            System.out.println("Change1: " + change1);
            System.out.println("Change2: " + change2);
            System.out.println("Change3: " + change3);

            // *** Change longPhrase by replacing all instances of the
            // character 'a' with the character 'z'
            longPhrase = longPhrase.replace("a", "z");

            System.out.println("Long phrase now: " + longPhrase);

            // *** Write a statement that prints out the length of longPhrase
            // (note: put your call to the length method inside the
            // print statement as in the program on page 120
            System.out.println(longPhrase.length());

            // *** Write a statement that prints out the character at
            // index 3 of the change1 string - put the call to the
            // appropriate method (i.e., chartAt()) in your print statement
            System.out.println("The character at index 3 of change 1 is :" + change1.substring(3, 4));

         }
   }
