package demojava;

import java.util.LinkedHashSet;

public class intersection {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,2,3,8};
		LinkedHashSet<Integer> sto = new LinkedHashSet<Integer> ();
		
		for(int t :a)
			sto.add(t);
		for(int h :b)
			
		   if (sto.contains(h))
		  System.out.println(h);
		    	

	}


}
