package demojava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Repeat extends Main {
	public static void repeat1(int[]a){
	int min=1	;
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int element:a)
		{
			if( ! set.add(element))
				
			{
				min=element;
			 // System.out.println(min);
			}
		//}
		if(min!=1)
		System.out.println(min);
				
	}}}
	

