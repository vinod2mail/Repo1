package dEV_02_10_18;

public class countprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=50;
		int count;
		int flag=0;
		
		for(int i=1;i<num;i=i+2)
		{
			count=0;
			for(int j=2;j<i/2;j++)
			{
				if((i%j)==0)
				{
					count++;
					break;
					
				}
			}
			if(count==0)
			{
				System.out.println(i);
				flag++;
			}
		}
		System.out.println("Total Number of "+flag);

	}

}
