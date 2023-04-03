package chapter04;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 제어문 실습하기
 * 
 */
public class SwitchControlStatement {
	public static void main(String[] args) {
		
		// break 가 포함되지 않았을 때
		int value1 = 2;
		switch(value1) {
		
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();
		
		
		// break 가 포함되었을 때
		int value2 = 2;
		switch(value2) {
		
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println();
		
		// if - if else else 구문으로 변환
		if(value1 == 1) {
			System.out.println("A");
		}else if(value1 == 2) {
			System.out.println("B");
		}else if(value1 == 3) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}
}
