
import java.util.ArrayList;
import java.util.Vector;

public class SubString {

	
	 
	
	  public static ArrayList<Integer> spiralOrder(int[][] matrix) {
	    
	        int i, k = 0, l = 0; 
	        
	        
			  ArrayList<Integer> list=new ArrayList<Integer>();	  

	        int m=matrix.length;
	        int n=matrix[0].length;
	           
	        while (k < m && l < n) 
	        { 
	            // Print the first row from the remaining rows 
	            for (i = l; i < n; ++i) 
	            { 
	           list.add(matrix[k][i]); 
	            } 
	            k++; 
	   
	            // Print the last column from the remaining columns  
	            for (i = k; i < m; ++i) 
	            { 
	                list.add(matrix[i][n-1]); 
	            } 
	            n--; 
	   
	            // Print the last row from the remaining rows */ 
	            if ( k < m) 
	            { 
	                for (i = n-1; i >= l; --i) 
	                { 
	                    list.add(matrix[m-1][i]);
	                } 
	                m--; 
	            } 
	   
	            // Print the first column from the remaining columns */ 
	            if (l < n) 
	            { 
	                for (i = m-1; i >= k; --i) 
	                { 
	                    list.add(matrix[i][l]);
	                } 
	                l++;     
	            }         
	        }
	        return list;
	    }
	    
		
		
	    	      
	    // driver program 
	  
	  
	public static void main(String[] args)
	{
//		System.out.print(lengthOfLongestSubstring(" "));
		 ArrayList<Integer> list = new ArrayList<Integer>();		
	
		int[][] mat={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		list=spiralOrder(mat);
		
//		spiralOrder(mat);
		System.out.println(list);
	}


}
