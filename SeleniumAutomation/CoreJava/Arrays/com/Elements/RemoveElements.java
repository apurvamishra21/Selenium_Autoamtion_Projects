package com.Elements;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {3 , 2 , 2 , 3};
		int val = 3;
		System.out.println(removeElement(nums , val));
	

	}
	
	static int removeElement(int nums[] , int val)
	{
		int count = 0;
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] != val) {
				nums[count++] = nums[i];
			}
		}
		return count;
		
	}

}