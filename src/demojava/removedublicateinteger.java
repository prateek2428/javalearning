package demojava;


import java.util.*;

public class removedublicateinteger extends Main {

	// Function to remove duplicate from array
	public static void 	uniqueinteger(int[] a)
	{
		LinkedHashSet<Integer> set	= new LinkedHashSet<Integer>();
               for(int i: a) {
		// adding elements to LinkedHashSet
		//for (int i = 0; i < a.length; i++)
			set.add(a[i]);
               }
		// Print the elements of LinkedHashSet
		System.out.println(set);
               
	}



}
