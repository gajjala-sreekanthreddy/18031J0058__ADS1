import java.util.Scanner;

class Node1
{
	Object data;
	Node1 next;
	Node1(int data)
	{
		this.data=data;
		next=null;
	}
}
class Queue
{
	Node1 head;
	Node1 tail;
	boolean isempty()
	{
		return head==null;
	}
	void add(int data)
	{
		Node1 n=new Node1(data);
		if(isempty())
		{
			head=n;
			tail=n;
		}
		else
		{
			tail.next=n;
			tail=tail.next;
		}
				
	}
	int remove()
	{
		Node1 temp=head;
		
		if(isempty())
		{
			System.out.println("No elements");
		}
		else
		{
		head=temp.next;
		}
		return (int)temp.data;
	}
	
}


public class Solution {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		 int k=sc.nextInt();
		 int i=0;
		 while(sc.hasNext())
		 {
	        int m = sc.nextInt();
	        int n= sc.nextInt();

	        // initialize the queue
	        Queue queue =  new Queue(); 
	        for (i = 0; i < m; i++)
	        {
	            queue.add(i);
	        }

	      //  while (!queue.isempty()) 
		for (i = 0; i < m-1; i++)
	        {
	            for (int j = 0; j < n-1; j++) 
	            {
	                queue.add(queue.remove());
	            }
	            System.out.print(queue.remove()+" ");
	        } 
	queue.add(queue.remove());
	        System.out.print(queue.remove());
	        System.out.println();
	        k++;
		 }
	    }

}