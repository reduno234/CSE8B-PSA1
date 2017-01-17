import java.io.*;
import java.util.*;

/*
 *  Name: Luis Calona
 *  Login: cs8bwaam
 *  Date: January 15, 2017
 *  File: Caesar.java
 *  Sources of Help: None
 */

public class Caesar {

    /**
     *
     */
    public static String encrypt(String s, int rotation) 
    {
        // String object to hold encrypted text
        String cipherText = "";

        // Loop through whole String
        for (int i = 0; i < s.length(); i++)
        {
            // Perform encryption
            char cipherLetter = Caesar.letterOperation(s.charAt(i), rotation);

            // Add encrypted letter to String
            cipherText = cipherText + cipherLetter;
        }

        return cipherText;
    }
    
    /**
     *
     */
    public static String decrypt(String s, int rotation) 
    {
        // Encrypts with opposite value of rotation to get decryption
        return Caesar.encrypt(s, rotation * -1);
    }

    /**
     *
     */
    private static char letterOperation(char letter, int rotation) 
    {
        // Checks if char is a letter
        if ( Character.isLetter(letter) )
        {
            // Checks if char is upper case
            if ( Character.isUpperCase(letter) )
            {
                return Caesar.rotate(letter, rotation);                    
            }

            else // If char is lower case
            {
                // Converts to upper case for rotation
                letter = Character.toUpperCase(letter);

                // Rotates letter and stores it into newLetter
                char newLetter = Caesar.rotate(letter, rotation);

                // Converts char back to lower case and then returns it
                return Character.toLowerCase(newLetter);
            }
        }

        else // If char is not a letter
        {
            // Return original char
            return letter;
        }
    }
    
    /** Rotation formula: "wraps" around when the new ASCII value 
     *  exceeds last letter in the alphabet ('Z'), which is ASCII 
     *  value 90, or index 25 in an array of characters 'A' to 'Z' 
     *  from index 0 to 25; formula subtracts 'A' (value 65) to 
     *  reset index to zero, makes sure letter + rotation does not 
     *  exceed 26 letters of alphabet, then adds back 'A' to get 
     *  the correct value
     */
    private static char rotate(char letter, int rotation)
    {
        // Takes care of case lower edge case
        if ( (Character.toUpperCase(letter) + rotation) < 65 )
        {
            // "Wraps" around backwards, right to left, starting from 'Z'
            return (char)( ( 26 + (rotation % 26) ) + letter );
        }
        
        // Takes care of normal and upper edge cases
        else
        {
            // "Wraps" around forwards, left to right, starting from 'A'
            return (char)( ( ( (letter + rotation) - 'A' ) % 26 ) + 'A' ); 
        }
    }

    /**
     *
     */
    public static String encryptTwo(String s, int rotation) 
    {
        // StringBuilder object to hold encrypted text
        StringBuilder cipherText = new StringBuilder();

        // Loop through whole String        
        for (int i = 0; i < s.length(); i++)
        {
            // Perform encryption
            char cipherLetter = Caesar.letterOperation(s.charAt(i), 
                rotation);

            // Add encrypted letter to String
            cipherText = cipherText.append(cipherLetter);
        }

        // Return StringBuilder converted to String
        return cipherText.toString();
    }

    /**
     *
     */
    public static String decryptTwo(String s, int rotation) 
    {
        // Encrypts with opposite value of rotation to get decryption 
        return encryptTwo(s, rotation * -1);
    }

}
