package Dev01_10_18;

import java.util.HashMap;

public class countcharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="vinodkumar vinodkumar";
		int value=0;
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		char s[]=str.toCharArray();
		 for(int i=0;i<s.length;i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				value=map.get(str.charAt(i));
						value++;
				map.put( str.charAt(i), value);
			}
			else
			{
				map.put(str.charAt(i),1);
			}
			
		}
		for(Character key:map.keySet())
		{
		System.out.println("Character:\t"+key+"\tCount\t"+map.get(key));
		}
	}

}
