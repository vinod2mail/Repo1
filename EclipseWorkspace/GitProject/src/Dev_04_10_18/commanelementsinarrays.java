package Dev_04_10_18;

public class commanelementsinarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={3,2,5,6,7,8};
		int b[]={3,2,5,6,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]);
				}
			}
		}

	}

}
