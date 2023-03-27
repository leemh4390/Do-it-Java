package chapter05;

import java.util.Arrays;

/*
 * 날짜 : 2023/03/25
 * 이름 : 이민혁
 * 내용 : Do-it 자바 배열 실습하기
 * 
 */
public class InitialValue {
	public static void main(String[] args) {
		// 스택 메모리값(강제 초기화되지 않음)
		int value1;
		// System.out.println(value1); 오류 발셍
		
		int value2[];
		//System.out.println(value2); 오류 발생
		
		int value3 = 0;
		System.out.println(value3);
		
		int[] value4 = null;
		System.out.println(value4);
		System.out.println();
		
		
		// 힙 메모리의 초기값(강제 초기화)
		// @기본 자료형 배열
		boolean[] array1 = new boolean[3];
		for(int i = 0; i < 3; i++) {
			System.out.println(array1[i] + " ");
		}
		
		int[] array2 = new int[3]; // 0으로 초기화
		for(int i = 0 ; i < array2.length; i++) {
			System.out.println(array2[i] + " ");
		}
		
		double[] array3 = new double[3];
		for(int i = 0; i < array3.length; i++) {
			System.out.println(array3[i] + " ");
		}
		
		// @참조 자료형 배열
		String[] array4 = new String[3]; // null 로 초기화
		for(int i = 0; i < array4.length; i++) {
			System.out.println(array4[i] + " ");
		}
		
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
		
	}
}
