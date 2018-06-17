package com.sharat.stackQueue;

import java.util.Stack;

public class SimplyPath {

	public String simplePath(String filepath){

		String[] path=filepath.trim().split("/");
		Stack<String> dir=new Stack<String>();
		for(int i=0;i<path.length;i++){
			//			System.out.println(path[i]);

			if(path[i].equals(".")){
				continue;
			}
			else if(path[i].equals("..")){
				//				System.out.println("poped "+dir.peek());
				if(dir.isEmpty())
					System.out.println("error");
				else
					dir.pop();

			}
			else{
				if(!path[i].equals("")){
					dir.push(path[i]);
					//				System.out.println("pushed 2 "+path[i]);
				}
			}
		}

		//simplified file path
		StringBuffer sb=new StringBuffer();
		StringBuffer temp=new StringBuffer();
		System.out.println(dir.size());
		if(dir.isEmpty()){
			sb=new StringBuffer();
			sb.append("/");
		}
		while(!dir.isEmpty()){
			sb=new StringBuffer("/");
			sb.append(dir.pop()+temp);
			temp=sb;
			

		}

		return sb.toString();


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplyPath sp=new SimplyPath();
		String filepath="/a/./b/../../c/../";
		String filepath2="/home/users";
				String simplifiedPath=sp.simplePath(filepath2);

		System.out.println("simplified path: "+simplifiedPath);

	}

}
