package Dev_04_10_18;

public class FindmissingElementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,4,6,9,10,12};
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]!=a[i]+1)
			{
				System.out.println("Missing Number"+(a[i]+1));
			}

		}

	}

}
