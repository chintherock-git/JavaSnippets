package geekOfgeeksCollection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CollectionsClass {

	// The below program displays the code on how to use static methods of
	// Collections class in Java.util package ;
	// Displays method as sort, reverse sort, add,d copy and disjoint

	// declare List reference

	public static void main(String[]args) {
		
	List<String> l_string= new ArrayList<>();
	l_string.add("Abbott");
	l_string.add("Neil");
	l_string.add("Dhanajay");
	l_string.add("Lysa");
	l_string.add("Winpy");
	l_string.add("Eliza");
	
	List<String> l_string_copy= new ArrayList<>();
	l_string_copy.add("koko");
	l_string_copy.add("Neil");
	l_string_copy.add("Dhanajay");
	l_string_copy.add("Lysa");
	l_string_copy.add("Winpy");
	l_string_copy.add("Eliza");
	l_string_copy.add("Kanha");
	
	for(int i=0;i<l_string.size();i++) {
	
	System.out.println("Items are "+l_string.get(i));
	
	}
	
	System.out.println();
	
	System.out.println("The sorted list is ");
	Collections.sort(l_string);
	
	for(int i=0;i<l_string.size();i++) {
		
		System.out.println("Items are "+l_string.get(i));
		
		}
	
	System.out.println();
	
	System.out.println("The reverse sorting list");
	Collections.sort(l_string,Collections.reverseOrder());
	
	for(int i=0;i<l_string.size();i++) {
		
		System.out.println("Items are "+l_string.get(i));
		
		}
		
	System.out.println();
	System.out.println("Are these 2 Collections Disjoint True/false Answer is : "+Collections.disjoint(l_string,l_string_copy));				

	
	System.out.println();
	//perform Binary search of elements but only on sorted Collections to get the desired results
	Collections.sort(l_string);
	System.out.println("The index of the String Neil found in the Collection is "+Collections.binarySearch(l_string,"Neil"));
	
	System.out.println();
	//perform Binary search of elements but only on sorted Collections to get the desired results for element not existing in list
		System.out.println("The index of the String Dogs not found in the Collection is -the insertion point-1 is "+Collections.binarySearch(l_string,"Dogs"));
	
		
		List<String> l_string_src= new ArrayList<>();
		l_string_src.add("Chinmayee");
		l_string_src.add("Baitharu");
		l_string_src.add("Saraswati");
		l_string_src.add("Home");
		l_string_src.add("Temporary");
		l_string_src.add("amazingKrishna");
		
		//Pre-requisite to copy is to ensure the dest list is as long as the src list
		
		Collections.copy(l_string_copy,l_string_src);
		
		System.out.println();
		System.out.println("The Elements after copy from right list to left List are ");		
		for(int i=0;i<l_string_copy.size();i++) {
			
			System.out.println("After copy Items are "+l_string_copy.get(i));
			
			}
		

	}
}
