package lv00;

public class Test12 {
	public static void main(String[] args) {
		
		int age = 100;
		String answer = "";
		String temp = Integer.toString(age);
			for(int i = 0; i < temp.length(); i++) {
				answer += (char)(temp.charAt(i) + 49);
			}
		
			System.out.println(answer);
		
		
		
		
		
		
		
		
	}
}
