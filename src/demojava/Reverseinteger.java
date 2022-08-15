package demojava;

public class Reverseinteger {
	public static void rinteger(int b) {
	int sum=0;
	if (b%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
	  while(b>0) {
		  sum=sum*10+b%10;
	      b=b/10;
	  }
	 System.out.println(sum);    
		  
	}	

}
