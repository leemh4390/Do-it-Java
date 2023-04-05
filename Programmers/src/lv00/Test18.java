package lv00;

import java.util.HashMap;
import java.util.Map;

public class Test18 {
	public static void main(String[] args) {
		
		String answer = "";
		
		String[] morse = {
				 ".-","-...","-.-.","-..",".","..-.",
		            "--.","....","..",".---","-.-",".-..",
		            "--","-.","---",".--.","--.-",".-.",
		            "...","-","..-","...-",".--","-..-",
		            "-.--","--.."
		};
		
		String letter = ".... . .-.. .-.. ---";
		
		int ascii = 97;
		String[] alphabets = letter.split(" ");
		System.out.println(alphabets[0]);
		for(String alphabet : alphabets) {
			for(int i = 0; i < morse.length; i++) {
				if(morse[i].equals(alphabet)) {
					answer += (char)(ascii + i);
				}
			}
		}
		
		System.out.println(answer);
		
		
	}
}
