package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {

	public static String encrypt(String text) {
		
		String myText = text.replaceAll("[\\s\\p{Punct}]", "");
		
		StringBuilder evenLets = new StringBuilder();
        StringBuilder oddLets = new StringBuilder();
        
        for (int i = 0; i < myText.length(); i++) {
            char ch = myText.charAt(i);
            
            if (i % 2 == 0) {
                evenLets.append(ch);
            } else { 
                oddLets.append(ch);
            }
        }

	}

}
