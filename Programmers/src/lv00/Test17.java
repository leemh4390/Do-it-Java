package lv00;

public class Test17 {
	public static void main(String[] args) {
		
		int hp = 999;
		
		int cnt = 0;
		
		cnt += (hp/5);
		hp %= 5;
		
		cnt += hp/3;
		hp %= 3;
		
		cnt += hp/1;
		
		System.out.println(cnt);
		
		
	}
}
