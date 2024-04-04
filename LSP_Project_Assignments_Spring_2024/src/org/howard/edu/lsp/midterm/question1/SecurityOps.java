package org.howard.edu.lsp.midterm.question1;

/**
 * This class offers a method for encrypting a string by rearranging its characters
 * based on their indices.
 */
public class SecurityOps {

    /**
     * Encrypts input text by rearranging characters: first by even indices, then odd.
     * Ignores all whitespace and punctuation from the input.
     * 
     * @param input The string to be encrypted.
     * @return The encrypted string.
     */
    public static String encrypt(String input) {
        StringBuilder charsAtEvenIndices = new StringBuilder(); // Holds characters at even indices
        StringBuilder charsAtOddIndices = new StringBuilder(); // Holds characters at odd indices

        // striping the input string of whitespace and punctuation
        String processedText = input.replaceAll("\\s+","").replaceAll("\\p{Punct}","");
        
        // iterating through the processed text to separate characters based on index parity
        for (int index = 0; index < processedText.length(); index++) {
            if (index % 2 == 0) { // Check for even index
                charsAtEvenIndices.append(processedText.charAt(index));
            } else { // Handle odd index
                charsAtOddIndices.append(processedText.charAt(index));
            }
        }
        // Concatenating characters from even indices with those from odd indices
        return charsAtEvenIndices.toString() + charsAtOddIndices.toString();
    }

    public static void main(String[] args) {
        // Example usage of the encrypt method
        String encryptedText = encrypt("I love CSCI363");
        System.out.println("Encrypted Output: " + encryptedText); // Expected: "Encrypted Output: IoesI6LvCC33"
    }
}
