package lv00;

public class Test28 {
	public static void main(String[] args) {
		
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int[][] array = new int[num_list.length / n][n];
		for(int i = 0; i < num_list.length / n; i++) {
			for(int j = 0; j < n; j++) {
				array[i][j] = num_list[i * n + j];
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
