package com.sharat.array;

/*
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */

/*
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 */
public class Search2DMatrixForTarget {

	/*
	 * The array in given setup contains 2 bst, one at top corner and bottom corner
	 * 
	 */

	/*
	 * When listed for all the traversed elements, we see a total of row+col elements
	 * So time complexity in both case is O(m+n)
	 */

	public static boolean searchMatrix_right_top(int[][] matrix, int target) {
		if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
			return false;
		}
		int col = matrix[0].length-1;
		int row = 0;
		while(col >= 0 && row <= matrix.length-1) {
			if(target == matrix[row][col]) {
				return true;
			} else if(target < matrix[row][col]) {
				col--;
			} else if(target > matrix[row][col]) {
				row++;
			}
		}
		return false;
	} 

	public static boolean searchMatrix_bottom_left(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
			return false;

		int col = 0;
		int row = matrix.length - 1;
		while (col <= matrix[0].length - 1 && row >= 0) {
			if (target == matrix[row][col])
				return true;
			else if (target < matrix[row][col])
				row--;
			else if (target > matrix[row][col])
				col++;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={
				{1,4,7,11,15},
				{2,5,8,12,19},
				{3,6,9,16,22},
				{10,13,14,17,24},
				{18,21,23,26,30}
				};
		int target=5; //true 20// false
		
		boolean result1=searchMatrix_bottom_left(arr, target);
		boolean result2=searchMatrix_right_top(arr, target);
		
		System.out.println("result1: "+result1+" || result2: "+result2);
	}

}
