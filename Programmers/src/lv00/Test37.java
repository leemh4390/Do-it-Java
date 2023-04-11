package lv00;

import java.util.Arrays;

public class Test37 {
	public static void main(String[] args) {
		
		String my_string = "heLLo";
		
		String lowers = my_string.toLowerCase();
		
		System.out.println(lowers);
		
		char[] chars = lowers.toCharArray();
		
		Arrays.sort(chars);
		
		String answer = new String(chars);
		
		System.out.println(answer);
		
	}
}
