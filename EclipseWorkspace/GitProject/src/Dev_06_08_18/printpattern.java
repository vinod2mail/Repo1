
package Dev_06_08_18;

public class printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<num-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYY");
		
		for(int i=num;i>=0;i--)
		{
			for(int j=num-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
	}
		
		System.out.println("pri by number");
	
		for(int i=num;i>=0;i--)
		{
			for(int j=num-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			
	}
		int x=1;
		
		for(int i=num;i>0;i--)
		{
			for(int j=1;j<num-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+x*2);
				x++;
			}
			System.out.println();
		}
		int y=1;
		
		for(int i=0;i<num;i++)
		{
			for(int j=1;j<num-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+y*2);
				y++;
			}
			System.out.println();
		}
	}
	

}
