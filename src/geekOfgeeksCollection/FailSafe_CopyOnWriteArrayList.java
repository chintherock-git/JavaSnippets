package geekOfgeeksCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe_CopyOnWriteArrayList {
	public static void main(String [] args) {
		
		//CopyOnWriteArrayList  is Fail safe when iterating , it iterates over the copy of the Collection Object and
		//changes made during iteration does not throw exception it is handled and structural changes are reflected in original Collection 
	
	CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<Integer> ();
	copy.add(7);
	copy.add(88);
	copy.add(990);
	copy.add(70);
	copy.add(7000);
	
	Iterator<Integer> i= copy.iterator();
	while(i.hasNext()) {
	System.out.println("Element is "+i.next());
	copy.remove(1);
	copy.add(1,333);
		}
	
	
	System.out.println(" The original Collection is");
	for(Integer i_copy :copy) {
		System.out.println("Element is "+i_copy);
	}
	}
	
}
