package com.Elements;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = { 1 , 2 , 3, 4 , 5 , 6 };
		int rev[] = new int[x.length];
		int count = 0;
		for(int i = x.length-1; i>= 0 ; i--)
		{
			rev[count++] = x[i];
		}
		
		for(int i : rev)
		{
			System.out.println(i);
		}

	}

}
