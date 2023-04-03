package lv00;

/*
 * 날짜 : 2023/04/03
 * 내용 : 커피 사기
 *
 * */

public class Test02 {
	public static void main(String[] args) {
		
		int[] answer = new int[2];
		
		int money = 15000; // 가지고 있는 돈
		
		int coffee = 5500; // 커피 값
		
		answer[0] = money / coffee;
		answer[1] = money % coffee;
		
		for(int i = 0; i < 2; i++) {
			System.out.print(answer[i]);
		}
		
		
	}
}
