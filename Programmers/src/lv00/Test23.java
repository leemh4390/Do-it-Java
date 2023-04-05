package lv00;

public class Test23 {
	public static void main(String[] args) {
		
		String rsp = "205";
		
		rsp.length();
		
		String answer = "";
		
		
		for(int i = 0; i < rsp.length(); i++) {
			
			char c = rsp.charAt(i);
			
			if(c == '2') {
				answer += "0";
			}else if(c == '0') {
				answer += "5";
			}else {
				answer += "2";
			}
		}
		
		System.out.println(answer);
		
		
	}
}
