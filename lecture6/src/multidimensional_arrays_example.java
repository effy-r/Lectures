import java.util.Arrays;public class multidimensional_arrays_example {	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] grid;		// init
		grid = new int[4][4];		int[] row = grid[0];
		String row1Content = Arrays.toString(row);
		System.out.println(row1Content);		// fetching specific cell 
		System.out.println(grid[3][3]);		System.out.println("Init in line");
		int[][] table = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};		for(int[] arrayRow : table){		
			System.out.println(Arrays.toString(arrayRow));			
		}		System.out.println("assign value to specific cell");
		table[2][0] = 1;
		for(int[] arrayRow : table){		
			System.out.println(Arrays.toString(arrayRow));			
		}		System.out.println("Replace a row in 2-dim array");
		int[] specialRow = {1,1,1};		
		table[1] = specialRow;
		for(int[] arrayRow : table){		
			System.out.println(Arrays.toString(arrayRow));			
		}
	}}



