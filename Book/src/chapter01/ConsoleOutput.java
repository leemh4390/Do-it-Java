package chapter01;

/*
 * 날짜 : 2023/03/21
 * 이름 : 이민혁
 * 내용 : do it 자바 완전정복 콘솔 입출력 실습
 * 
 * */

public class ConsoleOutput {
	public static void main(String[] args) {
		
		System.out.println("안녕하세요.");
		System.out.println("안녕"+"하세요");
		System.out.println(2+4);
		System.out.println(4.6);
		System.out.println("문자 " + 1);
		System.out.println("문자 " + 1 + 2);
		System.out.println(1 + 2 + " 문자");
		System.out.println("===========================");
		
		int a = 5;
		String b = "하세요";
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕"+b);
		System.out.println(a + "안녕" + b);
		System.out.println("===============================");
		
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");
		System.out.println("======================");
		
		System.out.printf("%d\n", 10);
		System.out.printf("%o\n", 10);
		System.out.printf("%x\n", 10);
		System.out.printf("%f\n", 3.2582);
		System.out.printf("%4.2f\n", 3.2582);
		System.out.printf("%d 와 %4.2f\n",10,3.2585);
		
		System.out.println("안녕"+ 5.8);
		System.out.println(3 + 5 + "방가" + 4 + 2);
		System.out.printf("%s:%d","홍길동",15);
		
	
	}
}
