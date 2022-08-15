package demojava;

public class Swaptwonumbers extends Main {
	public static void swap(int a,int b) {
 int num=158;
 int sum=0;
 b=a+b;//48
 a=b-a;//
 b=b-a;
 System.out.println(a);
 System.out.println(b);
 while(num>0) {
sum=sum*10+num%10;
 num=num/10;
 }
 System.out.println(sum);
 
	}	
}
