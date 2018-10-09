package Dev_04_10_18;

import java.util.Scanner;

public class identitymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		int col=3;
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[row][col];
		System.out.println("Enter the Arrays elements");
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			if(j==i)
			{
				System.out.print("1");
			}
			else
				{                      
				System.out.print("0");    
				}   
			}
			System.out.println();


		}

	}

}
