package Dev_26_09_18;

public class printpascalTiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		
		int number;
		
		for(int i=0;i<num;i++)
		{  
			number=1;
			System.out.format("%"+(num-i)*2+"s", "");
			for(int j=0;j<=i;j++)
			{
				System.out.format("%4d",number);
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}

	}

}
