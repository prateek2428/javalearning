package demojava;

public class Maxmin {
public static void Main(String [] args) {
	int a[]= {'2','3','4'};
int max= a[0];
 for (int i=1 ;i<=a.length-1;i++)
	 if(max<a[i])
		 max=a[i];
 System.out.println(max);
	
	
	
	
}
}
