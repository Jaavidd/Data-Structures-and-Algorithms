

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
      
      System.out.print(l.find(2).getData());
  
  
  }




}





 class  Node {
  private Node next;
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

