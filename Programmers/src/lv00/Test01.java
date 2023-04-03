package lv00;

/*
 * 날짜 : 2023/04/03
 * 내용 : 배열 갯수
 *
 * */

class Solution{
	public int solution(int[] array, int n) {
		
		int answer = 0;
		
		
		for(int i = 0; i < array.length; i++) {
			if(n == array[i]) {
				answer++;
			}
		}
		
		return answer;
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 1;

		Solution sol = new Solution();
		
		int result = sol.solution(array, n);
		
		System.out.println(result);
		
		
		
	}
}
