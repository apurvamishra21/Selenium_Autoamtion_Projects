package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List_Integer_OddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1 ; i < list.size() ; i++)
		{
			list.add(i);
		}
		System.out.println(onlyOddNumbers(list));

	}
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				
				return false;
		}
		
		return true;
	}

}
