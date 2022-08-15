package demojava;

public class EQUALOFARRAY {

	public static void main(String [] args)
	{
	 int a[]= {1,2,3,4,5};
	 int b[]= {1,2,3,4,5,4};
	equal(a,b);
	} 
	public static void equal(int a[], int[] b)
	{
		int count=1;
	
		if(a.length==b.length) 
		{ 
			//System.out.println("equal");
			   for(int i=0;i<a.length;i++) 
			   {
				   if(a[i]==b[i]) {
					 System.out.println("1");  
				   }
				  
				   else 
				   {
					   count++;
					   //System.out.println("notequal");
			   
		            }
			   }
		}		   
			   
	    else 
	    {
		count++;
	    } 
		if(count!=1)
			System.out.println("not equal");
		else
			System.out.println("equal");
		 

	

}}
