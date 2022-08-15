package demojava;

public class Max {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int mIN= a[0];
		 for (int i=1 ;i<=a.length-1;i++) {
			 if(mIN>a[i])
				 mIN=a[i];
	}
		 System.out.println(mIN);// TODO Auto-generated method stub

	}

}
