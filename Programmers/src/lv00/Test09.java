package lv00;

import java.util.Arrays;

public class Test09 {
	public static void main(String[] args) {
		
		int answer = 0;
		
		int[] numbers = {1, 2, 4, 5 , 3};
		
		Arrays.sort(numbers);
		
		
		answer = numbers[numbers.length - 1] *  numbers[numbers.length - 2];
		
		System.out.println(answer);
		
		
		
		
		
	}
}
