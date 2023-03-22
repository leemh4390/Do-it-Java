package chapter03;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 연산자 실습하기
 * 
 */
public class RelationOperator {
	public static void main(String[] args) {
		
		// 크기 비교
		System.out.println("크기 비교");
		System.out.println(5 < 2); // false
		System.out.println(5 > 2); // true
		System.out.println(5 < 5); // false
		System.out.println(5 <= 5); // true
		System.out.println(5 >= 5); // true
		System.out.println("===============");
		
		// 등가 비교
		// @기본 자료형 비교
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a == c); // true
		System.out.println(a != c); // false
		
		// @참조 자료형 등가 비교
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		String str3 = "안녕";
		String str4 = "안녕";
		
	}
}
