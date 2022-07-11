package geekOfgeeksCollection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class ArrayListVectorSample {
	
	public static void main(String args[]) {
		
		
		ArrayList <Integer> arr= new ArrayList<Integer>();
		arr.add(304);
		arr.add(201);
		arr.add(609);
		arr.add(23);
		arr.add(44);
		arr.add(1857);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		arr.remove(1);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		
		Collections.sort(arr);
		
		System.out.println("The sorted arr is ");
		System.out.println();
		
		for(Integer i:arr) {
			System.out.print(i+" ");
		}
		
		arr.set(3,8978787);
		System.out.println("The List after addition of element is ");
		
		for(Integer i:arr) {
			System.out.print(i+" ");
		}
		
		Vector<String> vect= new Vector<String>();
		vect.add("Geeks of Geeks of Geeks of Geeks of Geeks of Geeks ");
		vect.add("Java T Point");
		vect.add("Git Hub");
		vect.add("THM");
		
		//Use Enumeration to iterate the Collection Vector
		System.out.println("Iterating the Vector Collection using enumerator");
		
		
		Enumeration<String> e =vect.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Collections.sort(vect);
		System.out.println("Iterating the Vector Collection using iterator");
		
		Iterator<String> i = vect.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			vect.set(0,"SauceLabs");
			
			
			//Uncomment the below line to experience the fail fast nature of vector
			
			//vect.remove(3);
			}
			//Iteration occurs on the original collection
			//When modifying the structure (add, remove, update )of the Collection during iteration it gives 
			//Exception in thread "main" java.util.ConcurrentModificationException
			//indicating it is fail fast even being synchronized
			
		System.out.println();
		System.out.println("After deleting an element in the Vector");
		System.out.println();
		
		vect.remove(3);
		
		for(String str:vect) {
			System.out.println(str);		}
		
	}

}