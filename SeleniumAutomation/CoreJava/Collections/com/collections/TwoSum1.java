package com.collections;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2 , 7 , 11 , 15};
		System.out.println(Arrays.toString(twoSum(nums ,9)));
	}
	
	static int[] twoSum(int[] nums , int target)
	{
		HashMap<Integer , Integer> hm = new HashMap<>();
		for(int i = 0 ; i < nums.length; i++)
		{
			int reqNum = target - nums[i];
			if(hm.containsKey(reqNum))
			{
				int[] arr = {hm.get(reqNum) , i};
				return arr;
			}
			hm.put(nums[i], i);
		}
		return nums;
		
	}

}
