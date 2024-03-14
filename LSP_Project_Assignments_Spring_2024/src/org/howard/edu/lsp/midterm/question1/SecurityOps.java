package org.howard.edu.lsp.midterm.question1;
//This class contains a method to encrypt a string by rearranging its characters.
public class SecurityOps {
    public static String encrypt(String text) {
    	// StringBuilder for characters at even indexes
        StringBuilder even = new StringBuilder();
     // StringBuilder for characters at odd indexes
        StringBuilder odd = new StringBuilder();

        // Removing whitespace and punctuation
        String cleanedText = text.replaceAll("\\s+","").replaceAll("\\p{Punct}","");
        
        // Looping through the cleaned text to separate characters by their indexes
        for (int i = 0; i < cleanedText.length(); i++) {
            if (i % 2 == 0) { //index is odd
                even.append(cleanedText.charAt(i));
            } else { //index is even
                odd.append(cleanedText.charAt(i));
            }
        }
        return even.toString() + odd.toString();
    }

    public static void main(String[] args) {
        // Testing the method with the given example
        String result = encrypt("I love CSCI363");
        System.out.println(result); // Expected output: "IoesI6LvCC33"
    }
}

