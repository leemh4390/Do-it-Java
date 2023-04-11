package lv01;

public class Test06 {
	public static void main(String[] args) {
		
		String s = "pPoooyY";
		
		String answer = "";
		
		String lowers = s.toLowerCase();
		
		System.out.println(lowers);
		
		char[] s_arr = lowers.toCharArray();
		
		int count_p = 0;
		int count_y = 0;
		
		for(char c : s_arr) {
			if(c == 'p') {
				count_p++;
			}
			
			if(c == 'y') {
				count_y++;
			}
		}
		
		if(count_p == count_y) {
			answer = "true";
		}else {
			answer = "false";
		}
		
		System.out.println(answer);
		
	}
}
