package lv00;

public class Test30 {
	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 5, 5, 20, 5};
		int maxProduct = Integer.MAX_VALUE;
		
		int answer = 0;
		
		for(int i = 0; i < numbers.length -1; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(i != j) {
					int product = numbers[i] * numbers[j];
					maxProduct = Math.max(maxProduct, product);
				}
			}
		}
		
		
		System.out.println(maxProduct);
		
		
	}
}
