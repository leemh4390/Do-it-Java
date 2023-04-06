package lv00;

public class Test26 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3 , 4};
		
		int answer = 0;
		
		int k = 2;
		
		answer = numbers[(2 * (k -1)) % numbers.length];
		
		
		System.out.println(answer);
		
	}
}
