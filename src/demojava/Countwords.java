package demojava;

public class Countwords {

	public static void main(String[] args) {
	String s= "hipra tikhellohowpra tikareyouprado nepratikpra";
	String[] s1=  s.split(" ");
	int count=0;
	for(int i=0;i<s1.length;i++)
	{
		//System.out.println(s1[i]);
		
		count++;
	}
		
	System.out.println(count);	
		
		
/*	int count =1;

	for(int i=0;i<s.length();i++)
	{
		if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
		{
			count++;
		}
	}
System.out.println(count);*/
	}

}
