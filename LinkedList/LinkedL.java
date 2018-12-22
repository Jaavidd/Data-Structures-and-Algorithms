

public class LinkedL {
   Node root;
   int size;
   
   public LinkedL()
   {
	   root=new Node();
	   size=0;
   }
   
  public void setSize(int s)
  {
	  this.size=s;
  }
   
  public int getSize()
  {
	  return this.size;
  }
  public Node add(int data)
  {
	  Node newNode=new Node(data,root);
	  this.root=newNode;
	  this.size++;
	  return newNode;
  }
   
  public Node find(int data)
  {
	  Node thisN=this.root;
	  
	  while(thisN !=null)
	  {
		  if(thisN.getData()==data)
			  return thisN;
		  thisN=thisN.getNext();
	  }
	  return null;
	  
	  
	  
  }
	public  void Print(LinkedL l)
	{
//		Node cur=this.root;
		Node cur=l.root;
	   while(cur!=null)
	   {
		   System.out.print(cur.getData()+" ");
		   cur=cur.getNext();
	   }
	}
	   
    Node sortedMerge(Node a, Node b)  
    { 
        Node result = null; 
        /* Base cases */
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        /* Pick either a or b, and recur */
        if (a.getData() <= b.getData())  
        { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        }  
        else 
        { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
  
    } 
  
    Node mergeSort(Node h)  
    { 
        // Base case : if head is null 
        if (h == null || h.next == null) 
        { 
            return h; 
        } 
  
        // get the middle of the list 
        Node middle = getMiddle(h); 
        Node nextofmiddle = middle.next; 
  
      
        middle.next = null; 
  
        
        Node left = mergeSort(h); 
  
       
        Node right = mergeSort(nextofmiddle); 
  
      
        Node sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
  
   
    Node getMiddle(Node h)  
    { 
        //Base case 
        if (h == null) 
            return h; 
        Node fastptr = h.next; 
        Node slowptr = h; 
       while (fastptr != null) 
        { 
            fastptr = fastptr.next; 
            if(fastptr!=null) 
            { 
                slowptr = slowptr.next; 
                fastptr=fastptr.next; 
            } 
        } 
        return slowptr; 
    } 
    
    
//    
//	public  Node sort(LinkedL l)
//	{
//		int temp;
//
//		Node current=l.root;
//		Node count=current;
////		
////		current=this.root;
////		sort1=this.root;
//      while(count.getNext()!=null) {
//    	  
//    	  current=count;
//		while (current.getNext()!=null)
//		{
//			if(current.getData()>current.getNext().getData())
//			{
//			temp=current.getData();
//			current.setData(current.getNext().getData());
//			current.getNext().setData(temp);
////			sort.root=sort.root.getNext();
//			}
//			current=current.getNext();
//		}
////		l=sort;
//		count=count.getNext();
//		
//
//		
//      }
//     
//		return current;
//	}
	 
   public boolean remove(int data)
   {
	   Node thisNode=this.root;
	   Node prevNode=null;
	   
	   while(thisNode!=null)
	   {
		   if(thisNode.getData()==data) {
			   prevNode.setNextNode(thisNode.getNext());
			   this.setSize(this.getSize()-1);
			   return true;
		   }
		   prevNode=thisNode;
		   thisNode=thisNode.getNext();
		   
		   
	   }
	   return false;
   }
 


  public static void main(String[] args)
  {
	  LinkedL l=new LinkedL();
      
      l.add(9);
      l.add(5);
      l.add(11);
      l.add(19);
      l.add(25);
      l.root = l.mergeSort(l.root);
//      l.remove(3);
     
      l.Print(l);
      

  }




}





 class  Node {
  Node next;
  private int num;
	
	Node() {}
	
	 Node(int val,Node next)
	{
		num=val;
		this.next=next;
	}
	
	 void setData(int val)
	{
		this.num=val;
	}
	int getData()
	{
		return this.num;
	}
  
	 void setNextNode(Node n)
	{
	this.next=n;
	}
	
	Node getNext()
	{
		return this.next;
	}
	
 }

