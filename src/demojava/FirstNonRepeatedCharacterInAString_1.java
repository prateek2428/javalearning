package demojava;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatedCharacterInAString_1 {

    public static void main(String[] args) {
   
   String f = "ramshyam";
   char[] s =f.toCharArray();
        Map<Character,Integer>  characterhashtable = 
                         new HashMap<Character ,Integer>();
       // Scan string and build hash table
        for (char ch:s)
        {
            if(characterhashtable.containsKey(ch))
            {
                // increment count corresponding to ch
                characterhashtable.put(  ch ,  characterhashtable.get(ch) +1 );
            }
            else
            {
                characterhashtable.put( ch , 1 ) ;
            }
        }
       Set<Map.Entry<Character ,Integer>> entryset =characterhashtable.entrySet();
        for(Map.Entry<Character ,Integer> entry: entryset)
        	if (entry.getValue()==2)
        		System.out.println(entry.getKey() +""+ entry.getValue());
       // System.out.println( characterhashtable);
    }}
 