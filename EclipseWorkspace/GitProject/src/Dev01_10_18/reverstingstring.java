package Dev01_10_18;

public class reverstingstring {

	public static String rever(String s)
	{
		if(s==null || s.length()<=1)
				{
			return s;
				}
		
		return rever(s.substring(1))+s.charAt(0);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="vinodkumar";
		
		String rev="";
		String take=rever(str1);
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer br=new StringBuffer(str1);
		System.out.println(br.reverse());
		System.out.println("From method\n"+take);
	}

}
