package chapter4;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 제어문 실습하기
 * 
 */
public class WhileControlStatement {
	public static void main(String[] args) {
		
		int a = 0;
		while(a < 10) {
			System.out.print("A" + ", ");
			a++;
		}
		
		int num = 0, sum = 0;
		
		while(sum < 100) {
			sum += num;
			num++;
		}
		System.out.println((num - 1) + "까지의 합 = " + sum);
		
		
		String[] animal = {"dog", "cat","pig", "cow"};
		
		for(String ani : animal) {
			System.out.print(ani + " ");
		}
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		
		int b = 10;
		while(b > 0) {
			System.out.println(b + " ");
			b--;
		}
		System.out.println("============");
		
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		int c = 0;
		while(true) {
			if(c > 10) {
				break;
			}
			System.out.println(c + " ");
			c++;
		}
	}
}
