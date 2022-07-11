package geekOfgeeksCollection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class FailSafe_withoutCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fail Safe Iterators do not always work on clone of the Collections
		//One such example is ConcurrentHashMap
		
		ConcurrentHashMap<Integer,String> copy = new ConcurrentHashMap<>();
		copy.put(1,"yes");
		copy.put(2,"no");
		copy.put(3,"maybe");
		copy.put(4,"amscared");
		copy.put(5,"havefaith");
		
		Iterator<Integer> key= copy.keySet().iterator();
		while(key.hasNext()) {
			Integer index=(Integer)key.next();
			System.out.println(copy.get(index));
			copy.put(100,"LoveJava");
		}
	}
	
	//Output displays its handles exception and changes the original Collection and not the copy

}
