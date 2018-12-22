

public class ValidationOfParanthesis {

	static class stack      { 
        int top=-1; 
        char items[] = new char[100]; 
  
        void push(char x)          { 
            if (top == 99)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top] = x; 
            } 
        } 
  
        char pop()  
        { 
            if (top == -1)  
            { 
                System.out.println("Underflow error"); 
                return '\0'; 
            }  
            else 
            { 
                char element = items[top]; 
                top--; 
                return element; 
            } 
        } 
  
        boolean isEmpty()  
        { 
            return (top == -1) ? true : false; 
        } 
    } 
      
    
    static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 
    
    
    public static boolean isValid(String s) {
   
    	 stack st=new stack();
    
    if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') return false;
     for(int i=0;i<s.length();i++)
    {
    	 if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
    	     	 st.push(s.charAt(i));
    	 
    	 
    	 if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
         {
    	  if(st.isEmpty()) return false;
    	 
    	 
    	 else if(!isMatchingPair(st.pop(), s.charAt(i)))
    		     return false;
         }
    	 
    	 
    }
    
     if (st.isEmpty()) 
         return true; /*balanced*/
  
 
     return false;

}

   
	public static void main(String[] args)
    {

    	System.out.println(isValid(" [ ( ( ) ] "));
		
		 
		 
    
    
    }
}
