package demojava;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class reverseword{
 public static void main(String []args)
 {
	String s="ram aam khata hai   g  " ;
	String[] a =s.split(" ");
	int count=0;
	String sum= ""; 
	String sum1= "";
	for(int i=s.length()-1;i>=0;i--)
	{
		sum1=sum1+s.charAt(i);
	}
	System.out.println(sum1);

	for(String t: a)
	{
		  StringBuilder str = new StringBuilder(t);
		  str.reverse();
		  sum=sum+ str.toString()+" ";
		count++;
	}
	System.out.println(sum);
	 
}}
