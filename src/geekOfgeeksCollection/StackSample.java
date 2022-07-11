package geekOfgeeksCollection;

import java.util.Stack;

public class StackSample {
	
	public int return_pos(Stack<Integer> stackexa, int ele) {
		
		return stackexa.search(ele);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<Integer> sInt= new Stack<>();
		sInt.push(34);
		sInt.push(92);
		sInt.push(3908);
		
		//Stacks Follows LIFO
		
		System.out.println("Top Element in the Stack is "+sInt.peek());
		
		//top element is popped out
		System.out.println("Top Element in the Stack is  when popped "+sInt.pop());
		
		
		for(int i=0;i<sInt.size();i++) {
			System.out.println(sInt.get(i));
		}
		int a =93;
		StackSample s = new StackSample();
		
		//returns -1 when element no on stack else pos
		System.out.println("The position of tye element in the stack is "+s.return_pos(sInt,a));

	}

}
