package chapter04;

public class ContinueControlStatement {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		
		POS1:
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(j == 2) {
						continue POS1;
					}
					System.out.println(i +" "+ j);
				}
			}
	}
}
