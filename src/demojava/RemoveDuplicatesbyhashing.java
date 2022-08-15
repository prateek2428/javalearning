package demojava;

import java.util.LinkedHashSet;

public class RemoveDuplicatesbyhashing extends Main{
	public static void removeDuplicates(String sto)   {

	LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
	for(int i=0;i<sto.length();i++)  { 
       if(! ch.add(sto.charAt(i)))
    		   {
    		 System.out.print(sto); 

    		   }
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//LinkedHashSet<Character> set = new LinkedHashSet<>();   
		   
		// for(Character ch : set)   
	           
}

