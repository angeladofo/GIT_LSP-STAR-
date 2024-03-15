package org.howard.edu.lsp.midterm.question1;

/**
 * This class handles encrypting text.
 */
public class SecurityOps {
	/** It rearranges the characters so it looks like a secret code!
     *
     * @param text the text to be encrypted
     * @return the encrypted text, all scrambled up and ready for secrecy
     */

	public static String encrypt(String text) {
		//removing all spacing etc.
		String myText = text.replaceAll("[\\s\\p{Punct}]", "");
		
		StringBuilder evenLets = new StringBuilder();
        StringBuilder oddLets = new StringBuilder();
        
        //looping through the text appending them respectively
        for (int i = 0; i < myText.length(); i++) {
            char ch = myText.charAt(i);
            
            //even goes to evenLets odd goes to oddLets
            if (i % 2 == 0) {
                evenLets.append(ch);
            } else { 
                oddLets.append(ch);
            }
        }
        //combining the two
        return evenLets.toString() + oddLets.toString();

	}

}
