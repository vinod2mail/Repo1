package Dev01_10_18;

public class findsubstrinofthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="vinod kumar str banglore";
		String s="str";
		
		int st=4;
		int ed=20;
		char ch[]=new char[ed-st+1];
		
		int index=str.indexOf(s);
		if(index!=-1)
		{
			System.out.print("Find at Index"+index);
		}
		
		str.getChars(st, ed+1, ch, 0);
		System.out.println("\n"+String.valueOf(ch));
	}

}
