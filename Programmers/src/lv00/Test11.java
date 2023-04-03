package lv00;

import java.util.Arrays;

public class Test11 {
	public static void main(String[] args) {
		
		int[] sides = {199, 72, 222};
		
		int answer = 0;
		
		Arrays.sort(sides);
		
		if(sides[2] < sides[0] + sides[1]) {
			answer = 1;
		}else {
			answer = 2;
		}
		
		int[] subArray = Arrays.copyOfRange(sides, 0, 3);
		int firstSide = subArray[0];
		int secondSide = subArray[1];
		int last = subArray[2];
		
		System.out.println(last);
		
		System.out.println(answer);
		
	}
}
