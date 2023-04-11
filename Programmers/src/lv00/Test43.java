package lv00;

import java.util.Arrays;

public class Test43 {
	public static void main(String[] args) {
		
		int[] array = {3, 10, 28};
		
		int n = 20;
		
		Arrays.sort(array);
		
		int closet = array[0];
		
		
		for(int i = 0; i < array.length; i++) {
			if(Math.abs(n - array[i]) < Math.abs(n - closet)) {
				closet = array[i];
			}
		}
		
		System.out.println("closet : " + closet);
		
		
		
		
	}
}
