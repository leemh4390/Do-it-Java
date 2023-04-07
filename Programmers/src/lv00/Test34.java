package lv00;

public class Test34 {
	public static void main(String[] args) {
		
		int order = 29423;
		
		int answer = 0;
		
		String strOrder = "" + order;
		for(int i = 0; i < strOrder.length(); i++) {
			char tempChar = strOrder.charAt(i);
			System.out.println(tempChar);
			
			if(tempChar == '3' || tempChar == '6' || tempChar == '9') {
				answer++;
			}
		}
		
		
	}
}
