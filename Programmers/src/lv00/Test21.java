package lv00;

public class Test21 {
	public static void main(String[] args) {
		
		StringBuilder answer = new StringBuilder();
		String my_string = "abCdEfghIJ";
		
		
		for(int  i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if(Character.isUpperCase(c)) {
				answer = answer.append(Character.toLowerCase(c));
			}else {
				answer = answer.append(Character.toUpperCase(c));
			}
		}
		
		System.out.println(answer.toString());
		
	}
}
