package geekOfgeeksCollection;

public class LinkedList {
	//Code Snippet to create singly Linked List
	
	//creating data type for Link List it contains data and also contains LinkedList node
	int data ;
	LinkedList next;
	//Default constructor
	LinkedList(){};	
	//Constructor with one parameter i.e. data 
	LinkedList(int data){
		this.data=data;
		this.next=null;
	}
	
	//Constructor with 2 parameters data and Node
	LinkedList(int data, LinkedList node){
		this.data=data;
		this.next=node;
	}
	
	 LinkedList reverse(LinkedList node) {
	//Traversing the linked List reversely
			//iterative process 
			//Time Complexity O(n) s each if the elements is traversed atleast once
			//Auxiliary Space is order on n O(n)
		//Here head is LinkedList create above i.e. node
			
			LinkedList prev=null;
			LinkedList next = null;
			LinkedList curr=node;
			
			/*int count=0;
			int iteration=0;
			 while(curr!=null){
		            count++;
		            curr=curr.next;
		        }
		        if (count%2==0)
		            iteration=(count/2)-1;
		        else
		            iteration=(count/2);
		        
		        System.out.println("size"+iteration);
		        curr=node;
		        while (iteration!=0){
		            next=curr.next;
		            prev=next.next;
		            curr.next=prev;
		            next.next=prev.next;
		            prev.next=next;
		            curr=next;
		            iteration--;
		        }*/
		
				while(curr!=null) {
					next=curr.next;
					curr.next=prev;
					prev=curr;
					curr=next;
					
				}
			node=prev;
		return node;
	}
	 
	 public static void print_LinkedList(LinkedList node){
		//Traversing the Linked List
			while(node!=null) {
				System.out.println(node.data);
				node=node.next;
			}
	 }
			
	public static int  size_LinkedList(LinkedList node){
		//Traversing the Linked List
		 int size=0;
			while(node!=null) {
				size++;
				node=node.next;
					}
			return size;
	 }
	
	public static LinkedList sum(LinkedList l1, LinkedList l2) {
		
		LinkedList Result=null;
		LinkedList Resulthead=null;
		LinkedList next=null;
		LinkedList addendum1= l1;
		LinkedList addendum2= l2;
		int size= size_LinkedList(l1)>size_LinkedList(l2) ? size_LinkedList(l1): size_LinkedList(l2);
		int carry = 0;
		int sum=0;
		while ((addendum1!=null)&& (addendum2!=null)) {
			
				sum=addendum1.data+addendum2.data+carry;
			
					if(sum>=10) {
						sum = sum%10;
						carry=1;
					}
					else {
						carry=0;
					}
					if(Result==null) {
						Result=new LinkedList(sum,next);
						Resulthead= Result;
					}
					else {
						Result.next=new LinkedList(sum,next);
						Result=Result.next;
					}
					
					
						addendum1=addendum1.next;
					
							addendum2=addendum2.next;			
					
	}
		
		while (addendum1!=null) {
			sum=addendum1.data+carry;
			
			if(sum>=10) {
				sum = sum%10;
				carry=1;
			}
			Result.next=new LinkedList(sum,next);
			Result=Result.next;
			addendum1=addendum1.next;
		}
		while (addendum2!=null) {
			sum=addendum2.data+carry;
			
			if(sum>=10) {
				sum = sum%10;
				carry=1;
			}
			Result.next=new LinkedList(sum,next);
			Result=Result.next;
			addendum2=addendum2.next;
		}
		
		if(Result.data==0&&carry!=0)
		Result.next= new LinkedList(carry,null);
		
		return Resulthead;
	}
	
	public static void main(String[] args) {
		
		LinkedList node = new LinkedList(8);
		node.next= new LinkedList(3);
		node.next.next= new LinkedList(2);
		//node.next.next.next= new LinkedList(5);
		//node.next.next.next.next= new LinkedList(8);
		LinkedList node2 = new LinkedList(9);
		node2.next= new LinkedList(2);
		node2.next.next= new LinkedList(1);
		//node2.next.next.next= new LinkedList(9);
		//node2.next.next.next.next= new LinkedList(8);
		System.out.println("The Linked List is ");
		print_LinkedList(node);
		//node=node.reverse(node);
		System.out.println("The reverse of the Linked List is ");
		print_LinkedList(node);
		
		System.out.println("The size of the Linked List is "+size_LinkedList(node));
		System.out.println("The size of the Linked List is "+size_LinkedList(node2));
		print_LinkedList(node2);
		
		LinkedList sum1= sum(node,node2);
		System.out.println("sum is ");
		print_LinkedList(sum1);
		
	}
}
