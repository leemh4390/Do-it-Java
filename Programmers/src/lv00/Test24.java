package lv00;

import java.math.BigInteger;

public class Test24 {
	public static void main(String[] args) {
		
		BigInteger answer = BigInteger.valueOf(0);
		
		int balls = 5;
		
		int share = 3;
		
		// balls 팩토리얼 계산식
		BigInteger ballsFact = BigInteger.valueOf(1);
		for(int i = 1; i <= balls; i++) {
			ballsFact = ballsFact.multiply(BigInteger.valueOf(i));
		};
		
		// share 팩토리얼 계산식
		BigInteger shareFact = BigInteger.valueOf(1);
		for(int i = 1; i <= share; i++) {
			shareFact = shareFact.multiply(BigInteger.valueOf(i));
		};
		
		// balls - share 팩토리얼 계산식
		BigInteger BallsMinusShare = BigInteger.valueOf(1);
		for(int i = 1; i <= balls - share; i++) {
			BallsMinusShare = BallsMinusShare.multiply(BigInteger.valueOf(i));
		}
		
		
		answer = ballsFact.divide(BallsMinusShare.multiply(shareFact));
		
		
		System.out.println(answer);
		
		
		
	}
}
