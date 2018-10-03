package dEV_02_10_18;

public class factorialofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		int num=5;
		
		for(int i=0;i<num;i++)
		{
			fact=fact+fact*i;
		}
		System.out.println(fact);
	}

}
