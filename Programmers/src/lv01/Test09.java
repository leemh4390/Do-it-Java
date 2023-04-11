package lv01;

import java.util.Arrays;

public class Test09 {
	public static void main(String[] args) {
		
		long n = 118372;
		
		// n 을 문자별로 변환
		String str_n = Long.toString(n);
		
		// 문자열을 문자 배열로 변환
		char[] chars = str_n.toCharArray();
		
		// 문자 정렬
		Arrays.sort(chars);
		
		// 정렬된 문자정렬을 revers
		String sortedStr = new StringBuilder(new String(chars)).reverse().toString();
		
		// 문자열을 정수로 변환
		long sortedNum = Long.parseLong(sortedStr);
		
		System.out.println(sortedNum);
		
	}
}
