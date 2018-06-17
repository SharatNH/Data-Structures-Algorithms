package com.sharat.graphs.traversal;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class bfs extends Graph{

	public bfs(int v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	
	public void breath_first_search(){
		
		//start point
		vertexList[0].visited=true;
		Deque<Integer> q=new LinkedList<Integer>();
		q.offer(0);
		//displayVertex(0);
		while(!q.isEmpty()){
			int index=adjacentUnVisitedVertex(q.peekFirst());
			if(index==-1){
				int num=q.pollFirst();
				//System.out.println("num:"+num);
				displayVertex(num);
			}
			else{
				vertexList[index].visited=true;
				q.offerLast(index);
			}
		}
	}
	
	public int adjacentUnVisitedVertex(int v){
		
		Iterator itr=arr[v].iterator();
		while(itr.hasNext()){
			int j=(Integer)itr.next();
			if(!vertexList[j].visited)
				return j;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bfs graph=new bfs(8);

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
		
		graph.breath_first_search();
		
		bfs g=new bfs(4);
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
		
		//g.breath_first_search();

	}

}
