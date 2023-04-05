package lv00;

public class Test19 {
	public static void main(String[] args) {

		int n = 13;
		
		int result = (int)Math.sqrt(n);
		
		
		if(n == result * result) {
			System.out.println("제곱입니다!");
		}else {
			System.out.println("아닙니다!");
		}
		
		System.out.println(result);
		
		
	}
}
