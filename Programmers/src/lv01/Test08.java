package lv01;

public class Test08 {
	public static void main(String[] args) {
		
		long n = 12345;
		long num = n;
		int cnt = 0;
		
		while(num != 0) {
			num /= 10;
			cnt++;
		}
		
		System.out.println(cnt);
		
		// 배열 선언
		int[] answer = new int[cnt];
		
		// 나머지를 배열에 저장
		num = n;
		for(int i = 0; num != 0; i++) {
			answer[i] = (int)(num % 10);
			num /= 10;
			
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(answer[i]);
		}
		
		
		
		
	}
}
