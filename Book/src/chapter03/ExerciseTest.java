package chapter03;
/*
 *  날짜 : 2023/03/21
 *  이름 : 이민혁
 * 	내용 : do it 자바 완전정복 연산자 실습하기
 * 
 */
public class ExerciseTest {
	public static void main(String[] args) {
		
		System.out.println("연습문제 1 : " + (2 + 3 / 2)); // 예상 답 : 3
		System.out.println("연습문제 2 : " + (10 % 3 + 5 / 3 )); // 2
		System.out.println("연습문제 3 : " + (4 + 5 / 2) % 4); // 2
		
		
		int a = 5;
		int b = a++; 
		
		System.out.println(a); // 6
		System.out.println(b); // 5
		System.out.println(++a); // 7
		System.out.println(++b); // 6
		System.out.println(a++ + --b); //12 
		System.out.println(a + b); // 13
		
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);
		System.out.println(~5);
		
		System.out.println(7 << 2);
		System.out.println(7 >> 2);
		System.out.println(-7 << 2);
		System.out.println(-7 >> 2);
		System.out.println(-1 >>> 30);
		
		System.out.println(3 < 3); // false
		System.out.println(5 >= 3); // true
		System.out.println(5 <= 5); // true
		System.out.println(5 == 5); // true
		System.out.println(5 != 5); // false
		
		System.out.println(false && true); // false
		System.out.println((4 <= 4) || (6 < 3)); //true
		System.out.println(false ^ (3 >= 4));  // false
		System.out.println(!(3 <= 3)); // false
		
		int A = 4, B = 5, C = 6;
		System.out.println(false && A-- > 6); // false
		System.out.println(true | B++ > 6); // true
		System.out.println(true ^ C++ > 6); // 
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		int Q = 3;
		Q <<= 1;
		System.out.println(Q);
		
		Q &= 5;
		System.out.println(Q);
		
		Q -= 1;
		System.out.println(Q *= 2);
		
		
		int a1 = 3; 
		int b1 = 5;
		int c1 = 7;
		System.out.println(( a1 > 6) ? "안녕하세요" : "반갑습니다."); // 반갑
		System.out.println((a1 < b1 ) ? (b1 > c1) ? "타입 A" : "타입B" : (b1 > c1) ? "타입C" : "타입D");
		
		
	}
}
