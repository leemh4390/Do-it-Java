package chapter02;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 변수 실습하기
 * 
 */
public class FloatVSDouble {
	public static void main(String[] args) {
		
		// float 의 정밀도 확인 (대략 소수 7자리)
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.000000001f;
		System.out.println(f2);
		
		// double 의 정밀도 확인 (대략 소수 15자리)
		double d1 = 1.00000000001;
		System.out.println(d1);
		double d2 = 1.000000000000000001;
		System.out.println(d2);
	}	
}
