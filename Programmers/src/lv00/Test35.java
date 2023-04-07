package lv00;

import java.util.ArrayList;

public class Test35 {
	public static void main(String[] args) {
		
		int number = 12;
		
		ArrayList<Integer> list = new ArrayList<>(); 
		
		int cnt = 0;
		
		for(int i = 1; i <= number; i++) {
			
			if(number % i == 0) {
				list.add(i);
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
