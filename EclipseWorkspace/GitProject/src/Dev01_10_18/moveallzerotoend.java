package Dev01_10_18;

public class moveallzerotoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]a = {3, 2, 1, 0, 4, 0, 0, 2, 7, 0, 50, 0, 6, 8, 9, 0, 9, 1, 0, 8, 5};
		 
		 int cuurenindex=0;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]!=0)
			 {
				 a[cuurenindex]=a[i];cuurenindex++;
			 }
		 }
		 while(cuurenindex<a.length)
		 {
			 a[cuurenindex]=0;
			 cuurenindex++;
		 }
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]);
		 }
	}

}
