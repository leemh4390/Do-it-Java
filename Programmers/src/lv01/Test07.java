package lv01;

public class Test07 {
	public static void main(String[] args) {
		
		int n = 121;
		
		long sqrRt = (long) Math.sqrt(n);
		
		if(sqrRt * sqrRt == n) {
			System.out.println((sqrRt + 1) * (sqrRt  + 1));
		}else {
			System.out.println(-1);
		}
		
	}
}
