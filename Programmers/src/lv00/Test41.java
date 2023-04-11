package lv00;

public class Test41 {
	public static void main(String[] args) {
		
		int n = 3628800;
		
		int factorial = 1;
		
		int answer = 0;
		
		for(int i = 1; i <= 10; i++) {
			factorial *= i;
			
			if(factorial <= n) {
				System.out.println(factorial);
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
