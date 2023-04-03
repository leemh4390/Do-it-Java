package lv00;

public class Test14 {
	public static void main(String[] args) {
		
		String my_string = "nice to meet you";
		StringBuilder answer = new StringBuilder(my_string);

		String[] vowels = {"a", "e", "i", "o", "u"};

		for (int i = 0; i < vowels.length; i++) {
		    String vowel = vowels[i];
		    int index = answer.indexOf(vowel);
		    while (index != -1) {
		    	answer.deleteCharAt(index);
		        index = answer.indexOf(vowel, index);
		    }
		}

		System.out.println(answer.toString());
	}
}
