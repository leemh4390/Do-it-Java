package lv00;

class Solution1 {
	public int[] solution(String[] strlist) {
		
        int[] answer = new int[strlist.length];
        
        for(int i =0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        
        return answer;
		
	}
}

public class Test07 {
	public static void main(String[] args) {
		
		String[] strList = {"We","are","the","world!"};
		
		
		Solution1 sol = new Solution1();
		int[] result = sol.solution(strList);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}
