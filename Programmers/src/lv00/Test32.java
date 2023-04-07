package lv00;

public class Test32 {
	public static void main(String[] args) {
		
		
		String my_string = "I love you";
		
		int num1 = 3;
		int num2 = 6;
		
		char mv1 = my_string.charAt(num1);
		char mv2 = my_string.charAt(num2);
		System.out.println(mv1 +","+ mv2);
		
		StringBuilder builder = new StringBuilder(my_string);
		builder.setCharAt(num1, mv2);
		builder.setCharAt(num2, mv1);
		//my_string.replace(mv2, mv1);
		
		System.out.println(builder);
		
	}
}
