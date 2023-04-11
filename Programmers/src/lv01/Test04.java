package lv01;

import java.util.ArrayList;

public class Test04 {
	public static void main(String[] args) {
		
		int n = 12;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				list.add(i);
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		
	}
}
