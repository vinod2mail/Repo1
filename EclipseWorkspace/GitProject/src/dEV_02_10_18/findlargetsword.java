package dEV_02_10_18;

public class findlargetsword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Vinod kumar Banglore";
		int max=0;
		String longest="";
		String[] s=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>max)
			{
				max=s[i].length();
				longest=s[i];
			}

		}
		System.out.println(longest);
	}
}
