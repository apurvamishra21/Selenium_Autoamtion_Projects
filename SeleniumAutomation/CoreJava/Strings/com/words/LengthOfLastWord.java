package com.words;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// TODO Auto-generated method stub
		String s = "what you seek is seeking you";
		
		String str = s.trim();
		System.out.println(str);
		int count = 0;
			for(int i = str.length()-1 ; i >= 0 ; i--)
			{
				if(str.charAt(i)!=' ')
				{
					count++;
				}else {
					break;// else o/p is 23
			}
			
		}
	
			System.out.println(count);
	

	}

}
