package chapter03;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 연산자 실습하기
 * 
 */
public class ShiftOperator {
	public static void main(String[] args) {
		
		// 산술 시프트
		// @ <<
		System.out.println(3 << 1);
		System.out.println(-3 << 1);
		System.out.println(3 << 2);
		System.out.println(-3 << 2);
		System.out.println("===============");
		
		// @ >>
		System.out.println(5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(5 >> 2);
		System.out.println(-5 >> 2);
		System.out.println("==================");
		
		// 논리 시프트
		System.out.println(3 >>> 1);
		System.out.println(-3 >>> 31);
	}
}
