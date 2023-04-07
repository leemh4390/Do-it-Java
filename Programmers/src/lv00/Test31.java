package lv00;

import java.util.ArrayList;
import java.util.List;

public class Test31 {
	public static void main(String[] args) {
		
		int[] numlist = {1, 9, 3, 10, 13, 5};
		int n = 5;
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
				list.add(numlist[i]);
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
