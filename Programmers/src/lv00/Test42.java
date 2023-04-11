package lv00;

import java.util.ArrayList;
import java.util.List;

public class Test42 {
	public static void main(String[] args) {
		
		int count = 0;
		int i = 1;
		int j = 13;
		int k = 1;
		
		String strk = String.valueOf(k);
		for(int start = 1; start <= j; start++) {
			String value = String.valueOf(start);
			if(value.contains(strk)) {
				String[] array = value.split("");
				for(String alpha : array) {
					if(alpha.equals(strk)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
