package Dev_04_10_18;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,3,4,5,5,6,7,8,8,9};
		boolean value;
		
		for(int i=0;i<a.length;i++)
		{	value=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					value=true;
					 break;
					
				}
			}
			if(!value){
				System.out.print(a[i]);
			}
		}

	}

}
