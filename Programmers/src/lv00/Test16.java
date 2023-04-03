package lv00;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test16 {
	public static void main(String[] args) {
		
		String my_string = "1a2b3c4d123";
		
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(my_string);
		int sum = 0;
		while(matcher.find()) {
			String match = matcher.group();
			int num = Integer.parseInt(match);
			sum += num;
		}
		
		System.out.print(sum);
		
		
	}
}	
