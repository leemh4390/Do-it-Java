package chapter02;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 변수 실습하기
 * 
 */
public class OperationBetweenDataType {
	public static void main(String[] args) {
		
		// 같은 자료형 간의 연산
		int value1 = 3	+ 5;
		int value2 = 8 / 5;
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0 / 5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		int data3 = data1 + data2;
		// byte value5 = data1 + data2 << int 형보다 작은 자료형은 연산 결과 자료형은 int 이기에 에러발생
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(data3);
		
		// 다른 자료형 간의 연산
		double value6 = 5 + 3.5;
		int value7 = 5 + (int)3.5;
		
		double value8 = 5 / 2.0;
		byte data4 = 3;
		short data5 = 5;
		int value9 = data4 + data5;
		double value10 = data4 + data5;
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
	}
}
