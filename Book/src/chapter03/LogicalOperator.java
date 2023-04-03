package chapter03;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 연산자 실습하기
 * 
 */
public class LogicalOperator {
	public static void main(String[] args) {
		
		// 논리연산자
		// @AND(&&)
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(true && (5 < 3)); // false
		System.out.println((5 <= 5)&& (7 > 2)); // true
		System.out.println("=============");
		
		// @or(||)
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || (5 < 3));	// false
		System.out.println((5 <= 5) || (7 > 2)); // true
		System.out.println("===============");
		
		// @XOR(^)
		System.out.println(true ^ true); // f
		System.out.println(true ^ false); // t
		System.out.println(false ^ (5 < 3)); // f
		System.out.println((5 <= 5) ^ (7 > 2)); // f
		System.out.println("===============");
		
		
		// @NOT(!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5 < 3));
		System.out.println((5 <= 5) || !(7 > 2));
		
		// 비트 연산자로 논리 연산 수행
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true | (5 < 3));
		System.out.println((5 <= 5) | (7 > 2));
		System.out.println();
		
		// @쇼트 서킷 사용 여부(논리 연산자는0, 비트 연산자는 X)
		int value1 = 3;
		System.out.println(false && ++value1 > 6); // value1 은 실행하지 않음
		System.out.println(value1); 
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); // 실행함
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6); // 실행하지 않음
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);
		System.out.println(value4);
	}	
}
