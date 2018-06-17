package com.sharat.integer;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle/description/
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class PascalTriangle {
	
	public List<List<Integer>> form_pascal_triangle(int n){
		List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
		
		if(n<=0)
			return pascalTriangle;
		
		for(int i=0;i<n;i++){
			List<Integer> row=new ArrayList<Integer>();
			for(int j=0;j<=i;j++){
				if(j==0 || j==i){
					row.add(1);
				}
				else{
					row.add(pascalTriangle.get(i-1).get(j-1)+pascalTriangle.get(i-1).get(j));
				}
			}
			pascalTriangle.add(row);
		}
		return pascalTriangle;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle pt=new PascalTriangle();
		List<List<Integer>> PT=pt.form_pascal_triangle(5);
		System.out.println(PT);
	}

}
