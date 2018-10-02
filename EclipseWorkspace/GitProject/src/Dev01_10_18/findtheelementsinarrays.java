package Dev01_10_18;

import java.util.Arrays;
import java.util.HashMap;

public class findtheelementsinarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer in[]={2,3,4,2,2,4,6,7,8,9,11};
		int count=0;
		
		HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
		 for(int i:in)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i,1);
			}
		}
		System.out.println(Arrays.toString(in));
		System.out.println(map);
	}
	

}
