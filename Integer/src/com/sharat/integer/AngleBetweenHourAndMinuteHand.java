package com.sharat.integer;

public class AngleBetweenHourAndMinuteHand {

	public double finddegree(int hour,int minutes){
		
		double hr_deg=((30)*hour)+((5/60)*minutes);
		double min_deg=(6)*minutes;
		
		return Math.abs(hr_deg-min_deg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AngleBetweenHourAndMinuteHand ang=new AngleBetweenHourAndMinuteHand();
		int hour=6;
		int minutes=15;
		double degree_diff=ang.finddegree(hour, minutes);
		System.out.println("degree between hour and min hand: "+degree_diff);
	}

}
