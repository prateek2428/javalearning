package demojava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Dublicateno extends Main {
	 public static void Dublicateno1(int[] a)
	    {
		 LinkedHashSet<Integer> set	= new LinkedHashSet<Integer>();
	        for (int element :  a) 
	        {
	            if( ! set.add(element))
	            {
	                System.out.println("Duplicate Element : "+element);
	            }
	        }
	    }
	     

}
