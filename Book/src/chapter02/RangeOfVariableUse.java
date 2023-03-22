package chapter02;

/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 변수 실습하기
 * 
 */
public class RangeOfVariableUse {
	public static void main(String[] args) {
		
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		} // value2 변수가 사라지는 시점
		
		System.out.println(value1);
	} // value1 변수가 사라지는 시점
}
