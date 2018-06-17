package com.sharat.array;

import java.util.ArrayList;
import java.util.List;

class stockTranscation{
	int buy;
	int sell;
}
public class stock_buy {
	public int alltimeprofit(int[] price, int n){
		int sum=0;
		
		/*
		 * too complex solution...
		 */
		/*
		List<stockTranscation> arr=new ArrayList<stockTranscation>();
		for(int i=0;i<n-1;i++){	

			while(i<n-1 && price[i]>price[i+1])
				i++;

			int start=i++;

			while(i<n-1 && price[i]<price[i+1])
				i++;

			int sell=i;

			stockTranscation entity=new stockTranscation();
			entity.buy=start;
			entity.sell=sell;
			arr.add(entity);

			sum=sum+(price[sell]-price[start]);
		}
		*/
		
		for(int i=0;i<price.length-1;i++){
			if(price[i]<price[i+1])
				sum=sum+(price[i+1]-price[i]);
		}

		return sum;
	}

	public int onetimeprofit(int[] prices,int n){

		int min=prices[0];
		int max=0;

		for(int i=1;i<prices.length;i++){
			if(prices[i]-min>max){
				max=prices[i]-min;
			}
			if(prices[i]<min)
			{
				min=prices[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stock_buy stock=new stock_buy();
		int price[] = {100, 180, 260, 310, 40, 535, 695};
		int n = price.length;

		// function call
		int result1=stock.alltimeprofit(price, n);
		System.out.println("all time profit: "+result1);

		int result2=stock.onetimeprofit(price,n);
		System.out.println("one time profit: "+result2);
	}

}
