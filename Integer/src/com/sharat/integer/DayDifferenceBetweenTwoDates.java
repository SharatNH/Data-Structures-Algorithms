package com.sharat.integer;

public class DayDifferenceBetweenTwoDates {
	
	 public boolean isLeapYear(int year){
	        if(year % 400 == 0){
	            return true;
	        }
	        if(year % 4 == 0 && year % 100 != 0){
	            return true;
	        }
	        return false;
	    }
	
	private static int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
	
	/*
	 *  finding the individual days difference doesnt work.
	 *  hence we need to build it by normalizing even the year.
	 */
	public int caldays(int[] date1,int[] date2){
		
		int year1=date1[2];
		int year2=date2[2];
		
		int month1=date1[0];
		int month2=date2[0];
		
		int day1=date1[1];
		int day2=date2[1];
		
		int days1 = year1*365;
        int days2 = year2*365;
        
        for(int i=0; i < month1-1; i++){
            days1 = days1 + days[i];
        }
        
        days1+=day1;
      
    
        for(int i=0; i < month2-1; i++){
            days2 = days2 + days[i];
        }
        
        days2+=day2;
        
        System.out.println(days1+" "+days2);
       System.out.println( days2 - days1);
        
       // to calculate leap year
       // year should /4 and /400 and should not be /100
       
       //year/4 if m>2 else year-1/4 if m<2
        days1 = days1 + (year1-1)/4  - (year1 -1)/100 + (year1 -1 )/400; 
        days2 = days2 + (year2-1)/4  - (year2 -1)/100 + (year2 -1 )/400; 
        
        System.out.println("***************");
        System.out.println(days1+" "+days2);
        System.out.println( days2 - days1);
        
        
        if(isLeapYear(year1) && month1 > 2){
            days1++;
        }
        if(isLeapYear(year2) && month2 > 2){
            days2++;
        }
        
        System.out.println("**************");
        
        System.out.println( days2 - days1);
        return days2 - days1;
	
		/*
		 * below approach doesnt work 
		 * 347
		 * 17
		 * 
		 * for 01/15/2015 01/17/2015
		 */
		
//		int current_month=date2[0];
//		
//		int year_in_btw=date1[2]-date2[2];
//		int totaldays=0;
//		int totaldays2=0;
//		
//		//first year dates
//		for(int i=date1[0];i<12;i++){
//			totaldays+=days[i];
//		}
//		totaldays+=days[date1[0]]-date1[1];
//		System.out.println(totaldays);
//		
//		//second year dates
//		for(int i=0;i<current_month-1;i++){
//			totaldays2+=days[i];
//		}
//		
//		totaldays2+=date2[1];
//		
//		System.out.println(totaldays2);
//		if(date1[2]%4==0 || date2[2]%4==0)
//			totaldays++;
//		
//		if(year_in_btw>1){
//			totaldays=totaldays*year_in_btw;
//			if(year_in_btw/4>0){
//				totaldays+=year_in_btw/4;
//			}
//		}
//		
//		return totaldays;
//		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayDifferenceBetweenTwoDates dd=new DayDifferenceBetweenTwoDates();
		int date1[]={03,7,1945};
		int date2[]={8,31,2009};
		
		int days_in_between=dd.caldays(date1, date2);
		System.out.println("days in between the dates: "+days_in_between);
	}

}
