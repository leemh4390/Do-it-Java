package lv00;

import java.util.Arrays;

public class Test33 {
	public static void main(String[] args) {
		
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
		int max = array[0];
		int maxIndex = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		
		answer[0] = max;
		answer[1] = maxIndex;
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
