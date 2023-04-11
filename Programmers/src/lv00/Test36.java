package lv00;

public class Test36 {
	public static void main(String[] args) {
		
		int num = 232443;
		int k = 9;
		int answer = 0;
		String strNum = Integer.toString(num);
		String strK = ""+k;
				
		
		for(int i = 0; i < strNum.length(); i++) {
			char tempNum = strNum.charAt(i);
			
			if(strNum.indexOf(strK) == -1) {
				answer = -1;
			}else {
				answer = strNum.indexOf(strK)+1;
			}
			
		}
		
		System.out.println(answer);
			
	}
}
