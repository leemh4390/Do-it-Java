package lv00;

import java.util.Arrays;

public class Test15 {
	public static void main(String[] args) {
		
		int[] emergency = {3, 76 , 24};
		
		int[] answer = new int[emergency.length];
		int[] sort = Arrays.copyOf(emergency, emergency.length);
		Arrays.sort(sort);
		
		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(emergency[i] == sort[j]) {
					answer[j] = emergency.length - i;
				}
			}
		}
		
		for(int i = 0; i < emergency.length; i++) {
			System.out.println(answer[i]);
		}
		
		
		
		
		
		
	}
}
