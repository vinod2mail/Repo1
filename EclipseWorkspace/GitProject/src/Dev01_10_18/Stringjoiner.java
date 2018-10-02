package Dev01_10_18;

import java.util.StringJoiner;

public class Stringjoiner {

	public static String rever(String s)
	{
		if(s==null ||s.length()<=1)
		{
			return s;
		}
		return rever(s.substring(1))+s.charAt(0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner join=new StringJoiner(":");
		join.add("vinod");
		join.add("ramesh");
		join.add("rajesh");
		System.out.println(join);
		String str="vinodkumar";
		String rev=rever(str);
		System.out.println(rev);
	}

}
