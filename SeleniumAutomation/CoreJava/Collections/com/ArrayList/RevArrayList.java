package com.ArrayList;

import java.util.ArrayList;

public class RevArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0 ; i <= 10 ; i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int j = al.size()-1 ; j >= 0 ; j--)
		{
			a.add(al.get(j));
		}
		System.out.println(a);
	

	}

}
