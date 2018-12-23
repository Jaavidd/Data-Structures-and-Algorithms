
 class Queue {

	int front, rear, size; 
    int  capacity; 
    int array[]; 
       
    public Queue(int capacity) { 
         this.capacity = capacity; 
         front = this.size = 0;  
         rear = capacity - 1; 
         array = new int[this.capacity]; 
            
    } 
       
    // Queue is full when size becomes equal to  
    // the capacity  
    boolean isFull(Queue queue) 
    {  return (queue.size == queue.capacity); 
    } 
       
    // Queue is empty when size is 0 
    boolean isEmpty(Queue queue) 
    {  return (queue.size == 0); } 
       
    // Method to add an item to the queue.  
    // It changes rear and size 
    void enqueue( int item) 
    { 
        if (isFull(this)) 
        {
            return;            
        	//this.rear=this.capacity-1;
            //this.size=0;
        
        }
             
        this.rear = (this.rear + 1)%this.capacity; 
        this.array[this.rear] = item; 
        this.size = this.size + 1; 
//        System.out.println(item+ " enqueued to queue"); 
    } 
       
 
    int dequeue() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        int item = this.array[this.front]; 
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
        return item; 
    } 
       
   
    int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.front]; 
    } 
        
   
    int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.rear]; 
    } 
    
    void print(Queue queue)
    {
    	int i=queue.front;
    	while(queue.capacity>i)
    	{
    		System.out.print(queue.array[i++]+" ");
    		
    	}
    }
} 
   
    

public class Test 
{ 
    public static void main(String[] args)  
    { 
        Queue queue = new Queue(5); 
            
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        queue.enqueue(50);
        queue.print(queue);
        
//        queue.print(queue);
        queue.dequeue();

        System.out.println();
        queue.print(queue);
    } 

	
	
	
	
	
	
	
	
	
}
