package com.collections.removeduplicates;

import java.util.HashSet;
import java.util.Set;

public class IntegerArrUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1 , 2, 2 , 3,4,5,6,7,2,3};
		Set<Integer> hs = new HashSet<Integer>();
		
		for(int i : arr)
		{
			if(!hs.add(i))
			{
				System.out.println(i);
			}
		}

	}

}
