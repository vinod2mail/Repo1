package dEV_02_10_18;

import java.util.Arrays;
import java.util.HashMap;

public class CountNumberinarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]={2,2,2,3,4,5,6,5,5,6};
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i:a)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(map);
	}

}
