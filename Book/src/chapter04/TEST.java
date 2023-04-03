package chapter04;

public class TEST {
	public static void main(String[] args) {
		
		int score1 = 92;
		
		int score = score1 / 10;
		
		if(score >= 9) { // 90점 이상이면 ~
			System.out.println("A학점");
		}else if(score >= 8 && score < 9) { // 90점 이하 80점 이상이면
			System.out.println("B학점");
		}else if(score >= 7 && score < 8) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println();
		
		switch(score) {
		
		case 10:
		case 9 :
			System.out.println("A학점입니다.");
			break;
		case 8 :
			System.out.println("B학점입니다.");
			break;
		case 7 :
			System.out.println("C학점입니다.");
			break;
		default : 
			System.out.println("F학점입니다.");
		}
		
		System.out.println();
		
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 10; i > 0; i-=2) {
			System.out.println(i);
		}
		
		System.out.println("for 끝");
		System.out.println();
		
		int ai = 10;
		
		while(ai > 0) {
			System.out.println(ai);
			ai-=2;
		}
		System.out.println("while 끝");
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 2) {
					break;
				}
				if(j == 1) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println();
		System.out.println("6번 문제 start");
		
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3 && j==2) {
					i = 100;
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		
		loop:
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 5; j++) {
					if(i == 3 && j == 2) {
						break loop;
					}
					System.out.println(i + " ," + j);
				}
			}
		
		
		
	}
}
