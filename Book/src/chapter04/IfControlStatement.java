package chapter04;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 제어문 실습하기
 * 
 */
public class IfControlStatement {
	public static void main(String[] args) {
		
		// 유형 1 : if
		int value1 = 5;
		if(value1 > 3) {
			System.out.println("실행");
		}
		
		if(value1 < 5) {
			System.out.println("실행5");
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1) {
			System.out.println("실행3");
		}
		
		if(bool2) {
			System.out.println("실행4");
		}
		
		// 유형 2 : if else
		int value2 = 5;
		if(value2 > 3) {
			System.out.println("실행5");
		}else {
			System.out.println("실행6");
		}
		
		// 삼항 연산자와 변환 가능
		System.out.println((value2 > 3) ? "실행5" : "실행6");
		System.out.println("=================");
		
		int value3 = 85;
		if(value3 >= 90) {
			System.out.println("A학점");
		}else if(value3 >= 80) {
			System.out.println("B학점");
		}else if(value3 >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		
		if(value3 >= 70) {
			System.out.println("C학점");
		}else if(value3 >= 80) {
			System.out.println("B학점");
		}else if(value3 >= 90) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		
		if(value3 >= 70 && value3 < 80) {
			System.out.println("C학점입니다.");
		}else if(value3 >= 80 && value3 < 90) {
			System.out.println("B학점입니다.");
		}else if(value3 >= 90) {
			System.out.println("A학점입니다.");
		}else {
			System.out.println("F학점");
		}
		
		// 유형 3 : if if-else else
	}
}
