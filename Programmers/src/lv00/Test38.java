package lv00;

public class Test38 {
	public static void main(String[] args) {
		
		int num = 5;
		int answer = 0;
		
		for(int i = 4; i <= num; i++) {
			//System.out.println("i : " + i);
			int count = 0;
			for(int j = 1; j <= num; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count > 2) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
}
