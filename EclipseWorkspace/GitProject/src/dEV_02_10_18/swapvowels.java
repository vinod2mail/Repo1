package dEV_02_10_18;

public class swapvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Vinodkumar Biradar";
		String vowels="aeoiu";
		
		int low=0;
		int high=str.length()-1;
		char ch[]=str.toCharArray();
		while(low<high)
		{
			if(!vowels.contains(String.valueOf(str.charAt(low))))
			{
				low++;
				continue;
			}
			
			if(!vowels.contains(String.valueOf(str.charAt(high))))
			{
				high--;
				continue;
			}
			
			swap(low,high,ch);
			low++;
			high--;
		}
		System.out.println(ch);
	}
	public static void swap(int low,int high,char []ch)
	{
		char temp;
		temp=ch[low];
		ch[low]=ch[high];
		ch[high]=temp;
		
	}

}
