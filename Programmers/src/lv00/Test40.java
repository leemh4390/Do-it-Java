package lv00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test40 {
	public static void main(String[] args) {
		
		
		String before = "olleh";
		String after  = "hello";
		
		
		char[] before_char = before.toCharArray();
		char[] after_char 	= after.toCharArray();
		
		Arrays.sort(before_char);
		Arrays.sort(after_char);
		
		int answer = 0;
		
		String be_arr = new String(before_char);
		String af_arr = new String(after_char);
		
		
		for(int i = 0; i < before_char.length; i++) {
			
			if(be_arr.equals(af_arr)) {
				answer = 1;
			}else {
				answer = 0;
			}
		}
		
		
		System.out.println(answer);
		
		
	}
}
