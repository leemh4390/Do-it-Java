package chapter04;

/*
 * 날짜 : 2023/03/35
 * 이름 : 이민혁
 * 내용 : Do-it 자바 완전정복 제어문 실습하기
 * 
 */
public class OverlappedControlStatement {
	public static void main(String[] args) {
		// if - if 중복
		int value1 = 5;
		int value2 = 3;
		
		if(value1 > 5) {
			if(value2 < 2) {
				System.out.println("실행1");
			}else {
				System.out.println("실행2");
			}
		}else {
			System.out.println("실행3");
		}
		System.out.println();
		
		// switch - for 중복
		int value3 = 2;
		
		switch(value3) {
		case 1 :
			for(int k = 0; k < 10; k++) {
				System.out.print(k + "");
			}
		case 2 : 
			for(int k = 10; k > 0; k--) {
				System.out.print(k + "");
			}
			break;
		}
		System.out.println();
		System.out.println();
		
		// for-for-if 충복
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i + " " + j);
				if(i == j) {
					System.out.println("i = j");
				}
			}
		}
	}
}
