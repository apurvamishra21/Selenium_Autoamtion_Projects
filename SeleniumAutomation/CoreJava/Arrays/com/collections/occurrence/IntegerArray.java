package com.collections.occurrence;

import java.util.HashMap;
import java.util.Map;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1 , 2 , 2 , 3 , 3 , 4 , 5 , 6};
		HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		
		for(Map.Entry entry : hm.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
