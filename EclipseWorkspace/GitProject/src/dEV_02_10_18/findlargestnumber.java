package dEV_02_10_18;

public class findlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,4,5,6,7,8,1,0,4,3,2};
		int fl=0;
		int sl=0;
		
		for(int i:a)
		{
			if(fl<i)
			{
				sl=fl;
				fl=i;
				
			}
		}
		System.out.println("first Larger\t"+fl+"\n"+"Second Larger"+sl);
	}

}
