package com.sharat.integer;

import java.util.Arrays;

class Point{
	int x;
	int y;
}
public class FourPointsFormSquare {

	/* this doesnt work since, the points in other quadrant 
	 * like 1,0 -1,0 are same 
	 */
	public boolean validSquare(int[] p1,int[] p2,int[] p3,int[] p4){

		int[][] square={{p1[0],p1[1]},{p2[0],p2[1]},{p3[0],p3[1]},{p4[0],p4[1]}};

		int[] similar_points=new int[2]; //corresponding row is marked
		similar_points[0]=0;
		int[] similar_points_2=new int[2];
		int j=0;
		for(int i=1;i<4;i++){
			if(p1[0]==square[i][0])
			{
				similar_points[1]=i;

			}
			else{
				if(j==2)
					return false;
				similar_points_2[j++]=i;
			}
		}

		/* to find same square
		 * diagonal diff= (x1-x2)^2+(y1-y2)^2;
		 * 
		 * compare two diagonals
		 */

		double diagonal1=Math.pow(Math.abs(square[similar_points[0]][0]-square[similar_points[1]][0]), 2)+Math.pow(Math.abs(square[similar_points[0]][1]-square[similar_points[1]][1]), 2);
		double diagonal2=Math.pow(Math.abs(square[similar_points_2[0]][0]-square[similar_points_2[1]][0]), 2)+Math.pow(Math.abs(square[similar_points_2[0]][1]-square[similar_points_2[1]][1]), 2);

		return diagonal1==diagonal2;		
	}

	/*
	 * this method has nlog(n) efficency
	 */
	public boolean validSquare2(int[] p1, int[] p2, int[] p3, int[] p4) {
		int[] arr = {dis(p1, p2), dis(p1, p3), dis(p1, p4), dis(p2, p3), dis(p2, p4), dis(p3, p4)};
		Arrays.sort(arr);

		return arr[0] > 0 && arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3] && arr[4] == arr[5];
	}

	int dis(int[] a, int[] b) {
		return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
	}
	
	public boolean  isSquare(Point p1, Point p2, Point p3, Point p4)
	{
	    int d2 = distSq(p1, p2);  // from p1 to p2
	    int d3 = distSq(p1, p3);  // from p1 to p3
	    int d4 = distSq(p1, p4);  // from p1 to p4
	 
	    // If lengths if (p1, p2) and (p1, p3) are same, then
	    // following conditions must met to form a square.
	    // 1) Square of length of (p1, p4) is same as twice
	    //    the square of (p1, p2)
	    // 2) p4 is at same distance from p2 and p3
	    if (d2 == d3 && 2*d2 == d4)
	    {
	        int d = distSq(p2, p4);
	        return (d == distSq(p3, p4) && d == d2);
	    }
	 
	    // The below two cases are similar to above case
	    if (d3 == d4 && 2*d3 == d2)
	    {
	        int d = distSq(p2, p3);
	        return (d == distSq(p2, p4) && d == d3);
	    }
	    if (d2 == d4 && 2*d2 == d3)
	    {
	        int d = distSq(p2, p3);
	        return (d == distSq(p3, p4) && d == d2);
	    }
	 
	    return false;
	}
	
	int distSq(Point p, Point q)
	{
	    return (p.x - q.x)*(p.x - q.x) +
	           (p.y - q.y)*(p.y - q.y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p1={20, 10};
		int[] p2={10, 20};
		int[] p3={20, 10};
		int[] p4={10, 10};

		FourPointsFormSquare fp=new FourPointsFormSquare();
		boolean isSquare=fp.validSquare(p1, p2, p3, p4);
		System.out.println("valid square? :"+isSquare);

        Point c1 = new Point();
        c1.x = 2;
        c1.y = 2;
        Point c2 = new Point();
        c2.x = 6;
        c2.y = 2;
        Point c3 = new Point();
        c3.x = 2;
        c3.y = -2;
        Point c4 = new Point();
        c4.x = 6;
        c4.y = -2;
        
        System.out.println("is square method 3: "+fp.isSquare(c1, c2, c3, c4));
	}

}
