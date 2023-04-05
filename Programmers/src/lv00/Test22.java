package lv00;

import java.util.Arrays;

public class Test22 {
	public static void main(String[] args) {
		
		String my_string = "hi12392";
		
		String new_String = my_string.replaceAll("[^0-9]", "");
		
		int[] answer = new int[new_String.length()];
		
		
		for(int i = 0; i < new_String.length(); i++) {
			 answer[i] = Character.getNumericValue(new_String.charAt(i));
		}
		
		Arrays.sort(answer);
		
		for(int i = 0; i < new_String.length(); i++) {
			System.out.println(answer[i]);
		}
		
	}
}
