package com.sharat.integer;

public class DifferenceBetweenTwoTime {

	/* after considering the normal scenarios like 
	 * 3:20 4:55
	 * 
	 * corner case:
	 *  when both are in 55+ min
	 *  
	 *  ex: 8:59 and 9:55
	 *  
	 *  general method would have given it has 1 hr and 4 min diff,
	 *  but in reality is 56 min diff
	 */
	public int diff(int time1, int time2){
		if(time2 < time1){
			throw new IllegalArgumentException();
		}

		int hourDiff = time2/100 - time1/100 -1;
		int minDiff = time2%100 + (60 - time1%100);
		if(minDiff >= 60){
			hourDiff++;
			minDiff = minDiff - 60;
		}
		return hourDiff*100 + minDiff;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferenceBetweenTwoTime dbtt = new DifferenceBetweenTwoTime();
		int time = dbtt.diff(1400, 1645);
		System.out.println(time);
		time = dbtt.diff(1223, 1246);
		System.out.println(time);
		time = dbtt.diff(1500, 1620);
		System.out.println(time);
		time = dbtt.diff(344, 936);
		System.out.println(time);
		time = dbtt.diff(1000, 1234);
		System.out.println(time);
	}
}
