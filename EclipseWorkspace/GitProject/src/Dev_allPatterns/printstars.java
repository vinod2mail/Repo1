package Dev_allPatterns;

public class printstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		for(int i=1;i<num;i++)
		{
			System.out.print("      ");
			for(int j=1;j<num;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
