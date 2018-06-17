package singleton;

import java.util.concurrent.locks.ReentrantLock;

public class singleObject {

	private static singleObject instance;
	private static ReentrantLock objectLock=new ReentrantLock();;

	private singleObject(){}

	public static singleObject intitate(){
		if(instance==null){
			try{
				synchronized (objectLock) {
					instance=new singleObject();
					System.out.println("initialized");
					return instance;
				}	
			}
			finally{
				objectLock.unlock();
			}
		}
		return instance;
	}

	public void showMessage(){
		System.out.println("hello");
	}


}
