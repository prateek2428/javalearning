package demojava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sumof2array {
	
public static void main (String [] args) {
	int[] arr1 = {1,2,3,4,5,6};
	
	int[] arr2 = {1,2,3,4,5,6};
	
	  Integer[] arr3 =new  Integer[ arr1.length];
	  
	  for(int i=0;i<arr3.length;i++)
	  {
		  arr3[i]=arr1[i]+arr2[i];
		  
	  }
	  Arrays.sort(arr3,Collections.reverseOrder());
	  System.out.println(arr3.toString());
	//  System.out.println(Arrays.toString(arr3));
	
}

}
