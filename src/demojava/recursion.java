package demojava;

public class recursion {

	public static void main(String[] args) {
		int s=3;
		System.out.println(recursion.recursion(s));

	}
public static int recursion(int n) {
	if(n<=0)
		return 1;
	else
		return n* recursion(n -1);
	
	
	
}
}
