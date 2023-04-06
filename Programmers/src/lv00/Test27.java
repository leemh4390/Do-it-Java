package lv00;

class Solution2 {
	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		
        if(direction.equals("left")) {
			
			int First = numbers[0];
			for(int i = 0; i < numbers.length-1; i++) {
				answer[i] = numbers[i+1];
			}
			answer[numbers.length - 1]=First;
			
		}else{
			
			int Last = numbers[numbers.length - 1];
			for(int i = 0; i < numbers.length-1; i++) {
				answer[i+1] = numbers[i];
			}
			answer[0] = Last;
			
		}
		
		return answer;
	}
}

public class Test27 {
	public static void main(String[] args) {
		
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		

		Solution2 sol = new Solution2();
		
		int[] answer = sol.solution(numbers, direction); 
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
