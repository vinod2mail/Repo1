package Dev01_10_18;

import java.awt.geom.CubicCurve2D;

public class moveallzerotofisrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]a = {3, 2, 1, 0, 4, 0, 0, 2, 7, 0, 50, 0, 6, 8, 9, 0, 9, 1, 0, 8, 5};
		 
		 int countIndex=a.length-1;
		 
		 for(int i=a.length-1;i>=0;i--)
		 {
			 if(a[i]!=0)
			 {
				 a[countIndex]=a[i];
				 countIndex--;
			 }
		 }
		 
		 while(countIndex>=0)
		 {
			 a[countIndex]=0;
			 countIndex--;
		 }
		 System.out.print("{");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]);
		 }
		 System.out.print("}");
		 
		 

	}

}
