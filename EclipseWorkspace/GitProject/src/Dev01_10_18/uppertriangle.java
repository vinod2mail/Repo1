package Dev01_10_18;

import java.util.Scanner;

public class uppertriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=3;
		int col=3;
		Scanner sc=new Scanner(System.in);
		boolean isupper=true;
		int a[][]=new int [row][col];
		
		System.out.println("Enter the Array Element");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		
		
		System.out.println("Calculate the upperTriangle");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			if(a[i][j]!=0)
			{
				isupper=false;
				break;
			}
			}
			if(!isupper)
				break;
		}

		if(isupper)
		{
			System.out.println("is upper Triangle");
		}
		else
		{
			System.out.println("not upperTriangle");
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{

				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
