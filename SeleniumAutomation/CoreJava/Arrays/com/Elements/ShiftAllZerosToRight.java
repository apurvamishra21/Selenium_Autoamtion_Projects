package com.Elements;

import java.util.Arrays;

public class ShiftAllZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = new int[]{1, 0 , 2 , 0 , 3 , 0 , 0 , 0};
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

	}
	
	static int[] shiftZeroToRight(int[] a)
	{
		if(a.length == 1) {
			return a;
		}
		int newArray[] = new int[a.length];
		int count = 0;
		for(int number : a)
		{
			if(number != 0)
			{
				newArray[count] = number;
				count++;
			}
		}
		
		return newArray;
	}

}
