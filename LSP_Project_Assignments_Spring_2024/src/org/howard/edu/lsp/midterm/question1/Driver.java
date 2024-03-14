package org.howard.edu.lsp.midterm.question1;

public class Driver {

	public static void main(String[] args) {
		// Calling the static method encrypt from SecurityOps class with the test string
        String encryptedText = SecurityOps.encrypt("I love CSCI363");
        
        // Printing the result to the console
        System.out.println(encryptedText);
		// TODO Auto-generated method stub

	}

}
