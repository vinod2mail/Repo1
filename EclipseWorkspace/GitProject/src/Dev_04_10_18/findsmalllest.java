package Dev_04_10_18;

public class findsmalllest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,45,3,2,12,15};
		
		int fs=a[0];
		
		int ss=a[0];

for(int i=0;i<a.length;i++)
		{
			if(a[i]<fs)
			{
				fs=a[i];
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < ss && a[i] != fs) {
				ss = a[i];
			}
		}
		System.out.println(ss+"\t"+fs);

	}

}
