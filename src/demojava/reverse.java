package demojava;

public class reverse extends Main {

	public static void count(String str) {
		String s="";
		for (int i=str.length()-1;i>0;i--)
			s=s+str.charAt(i);
		System.out.println(s);
	
	
}
}