package lv00;

public class Test04 {
	public static void main(String[] args) {
		
		int[] num_list = {1,2,3,4,5};
		
		int[] answer = new int[2];
		
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) { // 짝수
				answer[0]++;
			}else {
				answer[1]++;
			}
		}
		
		System.out.println(answer[1]);
		
		
	}
}
