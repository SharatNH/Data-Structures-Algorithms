package com.sharat.integer;

import java.util.Arrays;

/*
 * 
 * https://leetcode.com/problems/candy/description/
 * 
 * There are N children standing in a line. Each child is assigned a rating value.
 * You are giving candies to these children subjected to the following requirements:
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 */

public class CandiesProblem {

	/* O(n) space and time*/
	public int candy(int[] ratings) {

		int candies[] = new int[ratings.length];        
		Arrays.fill(candies, 1);// Give each child 1 candy 

		for (int i = 1; i < candies.length; i++){// Scan from left to right, to make sure right higher rated child gets 1 more candy than left lower rated child
			if (ratings[i] > ratings[i - 1]) candies[i] = (candies[i - 1] + 1);
		}

		for (int i = candies.length - 2; i >= 0; i--) {// Scan from right to left, to make sure left higher rated child gets 1 more candy than right lower rated child
			if (ratings[i] > ratings[i + 1]) candies[i] = Math.max(candies[i], (candies[i + 1] + 1));
		}

		int sum = 0;        
		for (int candy : candies)  
			sum += candy;        
		return sum;

	}
	
	/* O(1) space and O(n) time*/
	//http://www.allenlipeng47.com/blog/index.php/2016/07/21/candy/
	public int candy1(int[] ratings){
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ratings[] = {1,3,4,3,2,1};
		CandiesProblem cp=new CandiesProblem();
		int total_candies=cp.candy(ratings);
		System.out.println("total candies required: "+total_candies);
	}

}
