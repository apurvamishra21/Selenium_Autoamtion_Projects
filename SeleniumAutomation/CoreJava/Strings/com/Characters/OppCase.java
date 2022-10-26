package com.Characters;

public class OppCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "BuDdHa";
		String res = "";
		
		for(int i= 0 ; i < s.length() ;i++)
		{
			char ch = s.charAt(i);
			String s1 = ch + "";
			if(ch >= 65 && ch <= 90)
			{
				res = s1+s.toLowerCase();
			}else {
				res = s1+s.toUpperCase();
			}
		}
		
		System.out.println(res);	

	}

}
