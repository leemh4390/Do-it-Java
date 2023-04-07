package lv00;

public class Test29 {
	public static void main(String[] args) {
		int[] box = {10, 8, 6};
		
		int n = 3;
		
		int answer = 1;
		
		for(int i = 0; i < 3; i++) {
			answer *= (box[i] / n);
		}
		
		System.out.println(answer);
		
	}
}
