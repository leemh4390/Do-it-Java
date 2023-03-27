package chapter04;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 제어문 실습하기
 * 
 */
public class DoWhileControlStatement {
	public static void main(String[] args) {
		//반복 횟수가 0일 때 do-while 문과 while문 비교
		int a;
		a = 0;
		while(a < 0) {
			System.out.print(a + "");	// 실행횟수 0번
			a++;
		}
		System.out.println("");
		
		a = 0;
		do {
			System.out.print(a + "");	// 실행횟수 1번
			a++;
		}while(a < 0);	
		System.out.println("");
		
		// 반복 횟수가 1일 때 do-while문과 while문 비교
		a = 0;
		while(a < 1) {
			System.out.print(a + "");	// 실행횟수 1번
			a++;
		}
		System.out.println("");
		
		a = 0;
		do {
			System.out.print(a + "");	// 실행 횟수 1번
			a++;
		}while(a < 1); 
		System.out.println("");
		
		// 반복 횟수가 10일 때 do-while문과 while문 비교
		a = 0;
		while(a < 10) {
			System.out.print(a + "");
			a++;
		}
		System.out.println("");
		
		a = 0;
		do {
			System.out.print(a + "");
			a++;
		}while(a < 10);
		
		
	}
}
