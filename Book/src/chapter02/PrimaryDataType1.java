package chapter02;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 변수 실습하기
 * 
 */
public class PrimaryDataType1 {
	public static void main(String[] args) {
		
		// boolean: true / false
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("==============");
		
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = 100L;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println("===================");
		
		// 실수 (flaot, double) : 음의 실수 / 0 / 양의 실수
		float value5 = 1.2F;
		double value6 = -1.5;
		double value7 = 5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
	}
}
