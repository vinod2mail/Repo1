package Dev_06_08_18;

public class prinmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int a=3;
		 for (int i = 1; i <= num; i++)
	        {
	            for (int j = 1; j < i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= num - i + 1; k++)
	            {
	                System.out.print(k*3 + " ");
	            }
	            System.out.println();
	        }
		}

	}


