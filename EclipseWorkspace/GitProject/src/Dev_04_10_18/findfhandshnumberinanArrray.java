package Dev_04_10_18;

public class findfhandshnumberinanArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,45,3,5,6,1};
		int fh=0;
		int sh=0;
		
		for(int i:a)
		{
			if(fh<i)
			{
				sh=fh;
				fh=i
						;
			}
		}

			System.out.println("first biggest"+fh+"\tSecond Biggest"+sh);
	}

}
