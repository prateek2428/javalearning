package demojava;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
	String s1="efffsd";
	String s2 ="pare";
	char[] arr1=s1.toUpperCase().toCharArray();
	 char arr2[] =	s2.toUpperCase().toCharArray();

	if(s1.length()==s2.length())
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	   boolean anagram=Arrays.equals(arr1, arr2);	
	   if(anagram==true)
		   System.out.println("anagram");
	   else
		   System.out.println("not anagram");
		   
	}
	else
	{
System.out.println("not anagram");
	

	}

}}
