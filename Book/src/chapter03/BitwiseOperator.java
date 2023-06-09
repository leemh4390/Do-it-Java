package chapter03;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 연산자 실습하기
 * 
 */
public class BitwiseOperator {
	public static void main(String[] args) {
		
		// 자바 메서드로 진법 변환
		int data = 13;
		System.out.println("자바 메서드로 진법 변환");
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println("=============");
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("0D",16));
		System.out.println("================");
		
		// 다양한 진법 표현
		System.out.println("다양한 진법 표현");
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		// 비트 연산자
		// @AND 비트 연산자
		System.out.println("AND 비트 연산자");
		System.out.println(3 & 10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);
		System.out.println("==============");
		
		// @XOR 비트 연산자
		System.out.println("XOR 비트 연산자");
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0a);
		System.out.println("=====================");
		
		// @NOT 비트 연산자
		System.out.println("NOT 비트 연산자");
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		
	}
}
