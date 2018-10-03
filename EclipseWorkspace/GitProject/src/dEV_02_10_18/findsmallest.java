package dEV_02_10_18;

public class findsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={13,12,5,7,18,19};
		int fs=a[0];
		int ss=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fs)
			{
			 fs=a[i];
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<ss && a[i]!=fs)
			{
				ss=a[i];
			}
		}

		System.out.println("First Small:\t"+fs+"\n"+"Second Smallest"+ss);
	}

}
