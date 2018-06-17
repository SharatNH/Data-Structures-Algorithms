package com.sharat.graphs.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class Vertex{
	char label;
	boolean visited;
	public Vertex(char lab){
		label=lab;
		visited=false;
	}
}
public class Graph {
	int maxVertex;
	Vertex vertexList[];
	int vertexCount;
	Stack stack;
	LinkedList<Integer> arr[];
	public Graph(int v){
		vertexCount=0;
		maxVertex=v;
		stack=new Stack();
		vertexList=new Vertex[maxVertex];
		arr=new LinkedList[maxVertex];
		
		for(int i=0;i<maxVertex;i++)
			arr[i]=new LinkedList<Integer>();
	}
	
	public void addVertex(char lab){
		vertexList[vertexCount++]=new Vertex(lab);
	}
	
	public void addEdge(int start,int end){
		arr[start].add(end);
		arr[end].add(start);
	}
	
	public void displayVertex(int index){
		System.out.println(vertexList[index].label);
	}
}
