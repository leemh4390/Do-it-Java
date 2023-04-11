package lv01;

public class Test02 {
	public static void main(String[] args) {
		
		int N = 123;
		
		int sum = 0;
		
		while(N > 0) {
			sum += N % 10;
			N /= 10;
		}
		
		System.out.println(sum);
	}
}
