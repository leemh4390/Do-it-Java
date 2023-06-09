package chapter04;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 제어문 실습하기
 * 
 */
public class ForControlStatement {
	public static void main(String[] args) {
		// for문 기본 문법구조
		int a;
		for(a = 0; a < 3; a++) {
			System.out.println(a + " ");
		}
		System.out.println("==============");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " ");
		}
		System.out.println("==============");
		
		for(int i = 0; i < 100; i++ ) {
			System.out.println(i + " ");
		}
		System.out.println("==============");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i + " ");
		}
		System.out.println("==============");
		
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i + " ");
		}
		System.out.println("==============");
		
		for(int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println(i + j + " ");
		}
		System.out.println("===============");
		
		for(int i =0; ; i++) {
			if(i > 10 ){
				break;
			}
			System.out.println(i + " ");
		}
		
		System.out.println("무한루프 탈출");
	}
}
