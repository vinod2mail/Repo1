package Dev01_10_18;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f[]=new int [10];
		f[0]=0;
		f[1]=1;
		
		for(int i=2;i<f.length;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		
		for(int i=0;i<f.length;i++)
		{

			System.out.println(f[i]);
		}
		

	}

}
