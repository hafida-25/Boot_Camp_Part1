package com.bootcamp.level1;

public class Program10 {
	
	
	
	//Write a program to find the shortest path in a weighted graph using Dijkstra's algorithm in Java.
	
	// Initialize min value
	public int minDistance(int distanc[],Boolean b[]){
		
		int min =Integer.MAX_VALUE,index=-1;
		for(int x=0;x<5;x++)
		{
			if(b[x]==false && distanc[x]<=min) {
				min=distanc[x];
				index=x;
				
			}
			
		}
		return index;
		
	}
	
	// function to print 
	public void printGraph(int distanc[],int x) {
		System.out.println("distance from source to distantion is :");
		for (int i=0;i<5;i++) {
			System.out.println(i+ " -----" +distanc[i]);
		}
	}
	
	
	public void djikstra(int graph[][],int src) {
		
		int distanc[]=new int [5];// 5 is lenght of node 
		Boolean b[] = new Boolean[5] ;// if node has been visited or no 
		 for (int i=0; i<5;i++) {
			 distanc[i]=Integer.MAX_VALUE;
			 b[i] =false;
		 }
		 distanc[src]=0;
		 
		 for(int count=0;count<5;count++) {
			 int u =minDistance(distanc,b);
			 b[u]=true;
			 for(int x=0;x<5;x++) {
				if(!b[x] && graph[u][x]!=0 && distanc[u]!=Integer.MAX_VALUE && distanc[u]+graph[u][x]<distanc[x])
{
					distanc[x]=distanc[u]+graph[u][x];
				}
			 }
			 printGraph(distanc,5);
			 
			 
		 }

}
	
	
	
	public static void main(String[] args) {
		//Write a program to find the shortest path in a weighted graph using Dijkstra's algorithm in Java.	
	
		int graph[][] = new int[][] {{0,4,0,0,9},
			                         {4,0,1,11,0},
			                         {0,1,0,8,0},
			                         {0,2,6,0,4},
			                         {7,0,0,3,2}};
		
	Program10 p = new Program10();
	p.djikstra(graph,0);
}
}

	


