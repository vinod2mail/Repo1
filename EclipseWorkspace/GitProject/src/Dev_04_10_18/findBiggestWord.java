package Dev_04_10_18;

public class findBiggestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Vinodkumar Biradar From BangloreCity123";
		int maxl=0;
		String longgest ="";
		String s[]=str.split(" ");
		
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>maxl)
			{
				maxl=s[i].length();
				longgest=s[i];
			}
		}
		
		System.out.println(longgest);	
		

	}

}
