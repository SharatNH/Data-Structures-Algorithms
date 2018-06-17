package com.sharat.array;
/**
 * http://www.geeksforgeeks.org/search-floor-and-ceil-in-a-sorted-array/
 */
public class FloorAndCeilingSortedArray {
	
	public int floor(int input[], int x){
        int low = 0;
        int high = input.length-1;
        while(low <= high){
            int middle = (low + high)/2;
            if(input[middle] == x || (input[middle] < x && (middle == input.length-1 || input[middle+1] > x))){
                return middle;
            }else if(input[middle] < x){
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return -1;
    }
	
	public int ceiling(int input[], int x){
        int low = 0;
        int high = input.length-1;
        while(low <= high){
            int middle = (low + high)/2;
            if(input[middle] == x || (input[middle] > x && (middle == 0 || input[middle-1] < x))){
                return middle;
            }else if(input[middle] < x){
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return -1;
    }
	
	
	public void cal_floor_ceiling(int[] input,int item){
		 FloorAndCeilingSortedArray foc = new FloorAndCeilingSortedArray();
		 int floor=foc.floor(input, item);
		 int ceiling=foc.ceiling(input, item);
		 
		 
		 System.out.println("item: "+item+" floor: "+input[floor]+" ceiling: "+input[ceiling]);
		 return;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input[] = {1,2,5,6,11,15};
		 FloorAndCeilingSortedArray foc = new FloorAndCeilingSortedArray();
		 foc.cal_floor_ceiling(input, 4);
	}

}
