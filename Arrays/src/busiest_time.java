/* business time in the mall--pramp*/


public class busiest_time {
	
	static int findBusiestPeriod(int[][] data){
		int maxCount=data[0][1];
		int maxTime=data[0][0];
		int peopleCount=data[0][1];
		int timeStamp=data[0][0];
		for(int i=1;i<data.length;i++){
			
			if(timeStamp!=data[i][0]){
				if(peopleCount>maxCount){
					maxCount=peopleCount;
					maxTime=timeStamp;
				}
				timeStamp=data[i][0];
			}
		
				if(data[i][2]==1)
					peopleCount=peopleCount+data[i][1];
				else
					peopleCount=peopleCount-data[i][1];
		}
		
		if(peopleCount>maxCount)
			return timeStamp;
		else
			return maxTime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data={{1487799425,14,1},
						{1487799425,4,1},
						{1487799425,2,1},
						{1487800378,10,1},
						{1487801478,18,1},
						{1487901013,1,1},
						{1487901211,7,1},
						{1487901211,7,1}};
			
			//{{1487799426,21,1}};
			
				/*{{1487799425, 14, 1},
                {1487799425, 4,  0},
                {1487799425, 2,  0},
                {1487800378, 10, 1},
                {1487801478, 18, 0},
                {1487801478, 18, 1},
                {1487901013, 1,  0},
                {1487901211, 7,  1},
                {1487901211, 7,  0}
               }; */
 
		int max=findBusiestPeriod(data);
		System.out.println("max: "+max);
	}

}
