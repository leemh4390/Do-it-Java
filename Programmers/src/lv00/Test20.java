package lv00;

public class Test20 {
	public static void main(String[] args) {
		
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String result = "attck";
		String answer = "";
		int number = 0;
		
		int length = cipher.length();
		
		for(int i = code; i <= cipher.length(); i+=code) {
			answer += cipher.substring(i -1, i);
		}
		
		System.out.println(answer);
	}
}
