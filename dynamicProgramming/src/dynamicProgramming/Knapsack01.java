package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Date 04/04/2014
 * @author Tushar Roy
 *
 * 0/1 Knapsack Problem - Given items of certain weights/values and maximum allowed weight
 * how to pick items to pick items from this set to maximize sum of value of items such that
 * sum of weights is less than or equal to maximum allowed weight.
 *
 * Time complexity - O(W*total items)
 *
 * Youtube link
 * Topdown DP - https://youtu.be/149WSzQ4E1g
 * Bottomup DP - https://youtu.be/8LusJS5-AGo
 *
 * References -
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
 * https://en.wikipedia.org/wiki/Knapsack_problem
 */
public class Knapsack01 {

    /**
     * Solves 0/1 knapsack in bottom up dynamic programming
     */
    public int bottomUpDP(int val[], int wt[], int W){
        int K[][] = new int[val.length+1][W+1];
        for(int i=0; i <= val.length; i++){
            for(int j=0; j <= W; j++){
                if(i == 0 || j == 0){
                    K[i][j] = 0;
                    continue;
                }
                //weight is less than the capacity
                if(j - wt[i-1] >= 0){
                    K[i][j] = Math.max(K[i-1][j], K[i-1][j-wt[i-1]] + val[i-1]);
                }else{
                    K[i][j] = K[i-1][j];
                }
            }
        }
        return K[val.length][W];
    }

    

    public static void main(String args[]){
        Knapsack01 k = new Knapsack01();
        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
        int r = k.bottomUpDP(val, wt, 30);
        System.out.println(r);
    }
}