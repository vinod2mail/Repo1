package dEV_02_10_18;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,5,7,9,11};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]!=a[i]+1)
			{
				System.out.println("Missing Number:\t"+(a[i]+1));
			}
		}

	}

}
