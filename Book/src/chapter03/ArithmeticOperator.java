package chapter03;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 연산자 실습하기
 * 
 */
public class ArithmeticOperator {
	public static void main(String[] args) {
		
		//산술 연산자
		System.out.println(2 + 3);
		System.out.println(8 - 5);
		System.out.println(7 * 2);
		System.out.println(7 / 2);
		System.out.println(8 % 5);
		System.out.println();
		
		// 증감 연산자 @case1
		int value1 = 3;
		value1++;
		System.out.println(value1); // 아마도 출력 결과는 4
		
		int value2 = 3;
		++value2;;
		System.out.println(value2);
		System.out.println("===========");
		
		// 증감 연산자 @case2
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3);
		System.out.println(value4);
		System.out.println("============");
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("============");
		
		// 증감연산자 @case3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("============");
		
		int value11 = 10;
		int value12 = ++value11;
		
		System.out.println(value11);
		System.out.println(value12);
		
	}
}
