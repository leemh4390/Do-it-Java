package lv00;

import java.util.ArrayList;
import java.util.List;

public class Test39 {
	public static void main(String[] args) {
		
		String my_string = "people";
		
		
		char[] ch = my_string.toCharArray();
		
		List<String> arr = new ArrayList<>();
		
		for(int i = 0; i < my_string.length(); i++) {
			if(!arr.contains(String.valueOf(my_string.charAt(i)))) {
				arr.add(String.valueOf(my_string.charAt(i)));
			}
		}
		
		System.out.println(String.join("", arr));
	}
}
