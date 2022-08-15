package demojava;

public class Prime extends Main {
	public static boolean primen(int b) {
	int	count = 0;

			for(int i=1;i<=b;i++)
			{
				 if(b%i==0) 				 {
		            count++	;
				 }
			
			}
		if (count==2)
			return true;
		else 
			return false;
				
		
		

}
}