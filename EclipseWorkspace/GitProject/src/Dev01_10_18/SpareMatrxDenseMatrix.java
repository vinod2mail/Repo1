package Dev01_10_18;

import java.util.Scanner;

public class SpareMatrxDenseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int row = 3;
		int col = 3;
		Scanner sc = new Scanner(System.in);
		boolean isupper = true;
		int a[][] = new int[row][col];

		System.out.println("Enter the Array Element");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Calculate the upperTriangle");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] == 0) {
					count++;
				}
			}
			
		}
		
		if (count > (row * col) / 2) {
			System.out.println("is Spare");
		} else {
			System.out.println("is Dense");
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
