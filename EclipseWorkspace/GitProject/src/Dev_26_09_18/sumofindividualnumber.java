package Dev_26_09_18;

public class sumofindividualnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
      System.out.println(sum);
	}

}
