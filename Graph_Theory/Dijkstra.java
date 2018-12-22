package Graphs;
import java.util.Scanner;

public class Dijkstra {


  static class PriorityQueue {
	
		private int size;
		private int[] arr;
		private int nItems;
		
		public PriorityQueue(int size)
		{
			this.size=size;
			
			arr=new int[size];
			nItems=0;
		}
		public void insert(int val)
		{
			int i;
			if(nItems==0) {
				arr[0]=val;
				nItems++;
				return;
			}
		for(i=nItems-1;i>=0;i--)
		{
			if(val>arr[i]) {
				arr[i+1]= arr[i];
				
			} else {
				break;
			}
			}
		arr[i+1]=val;	
		nItems++;
		}
		
		
		public  int remove()
		{
			return arr[--nItems];
		}
		
		public boolean isEmpty()
		{
			return nItems==0;
		}
		
		
	   
}

	
	public static int dijkstra(int[][] ar,int u,int v)
	{
		PriorityQueue queue=new PriorityQueue(ar.length);
		int[] dist=new int[ar.length];
		dist[u]=0;
		int source=u;
		for(int i=0;i<ar.length;i++)
  		{
	         if(i!=u) dist[i]=Integer.MAX_VALUE;		
		}
	 	
		
		
		  
		 for(int i=0;i<ar.length;i++)
  		{
			 if(source==v) 
		     {
			   return dist[v];
			 }
			
			 if(ar[source][i]!=0 && ar[source][i]!=-1) {
		  
			  if(ar[source][i]+dist[source]<dist[i]) {
				dist[i]=ar[source][i]+dist[source];
	            queue.insert(i);
	            }
			  }
	      
	         if(i==ar.length-1) {
				 i=0;
				 if(queue.isEmpty()) return -1;
				 source=queue.remove();
			 }
  		}
		 
		
		return -1;
	}

	public static void main(String[] args)
    {
		 long startTime = System.currentTimeMillis();

      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int u=scan.nextInt();
      int v=scan.nextInt();
      int[][] arr=new int[n][n];
      for(int i=0;i<arr.length;i++)
      {
   	   for(int j=0;j<arr.length;j++)
   	   {
   		   int num=scan.nextInt();
   		   arr[i][j]=num;
   	   }
   				
      }
     // System.out.println(arr.length);
     System.out.println(dijkstra(arr,u-1,v-1));
     long stopTime = System.currentTimeMillis()/60;
     long elapsedTime = stopTime - startTime;
   //  System.out.println(elapsedTime);
    }
	}
	
	
	
	
     
    