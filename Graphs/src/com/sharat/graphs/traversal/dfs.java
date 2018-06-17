package com.sharat.graphs.traversal;

import java.util.Iterator;


public class dfs extends Graph{

	public dfs(int v) {
		super(v);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public void depth_first_search() {
		vertexList[0].visited=true;
		stack.push(0);
		System.out.println("first element:");
		displayVertex(0);

		while(!stack.isEmpty()){
			//	System.out.println("peek:"+(Integer)stack.peek());
			int index=getAdjacentUnvisistedVertex((Integer)stack.peek());
			//System.out.println("@2:"+index);
			if(index==-1){
				stack.pop();
			}
			else{
				vertexList[index].visited=true;
				displayVertex(index);
				stack.push(index);
			}
		}
	}

	public int getAdjacentUnvisistedVertex(int index){

		int j=0;
		Iterator<Integer> itr=arr[index].iterator();
		while(itr.hasNext()){
			Integer v= itr.next();
			if(!vertexList[v].visited)
				return v;
			else
				j++;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs graph=new dfs(8);

		//added the vertex
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addVertex('H');

		//adding edges
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 7);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);

		graph.depth_first_search();

		dfs g=new dfs(4);
		g.addVertex('0');
		g.addVertex('1');
		g.addVertex('2');
		g.addVertex('3');
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		g.depth_first_search();

	}

}
