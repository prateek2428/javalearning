package demojava;

import java.util.LinkedHashSet;

public class Dublicatecharacter extends Main {
	public static void dc(char[] k) {
		
		LinkedHashSet<Character> set = new	LinkedHashSet<Character>();
		 for(char e : k) {
			  if( ! set.add(e))
			 
		     {
		       System.out.println(e);
			
		     }
		 
		 }
	}
	

}
