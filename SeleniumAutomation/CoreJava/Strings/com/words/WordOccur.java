package com.words;

public class WordOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "what you seek is seeking you";
	int duplicatesCount = 0;
	
		
		String[] str = s.split(" ");
		
		for(int i = 0 ; i < str.length ; i++)
		{
			int count = 0;
			for(int j = 0 ; j < str.length ; j++)//why start from o becz we want it print occurrence of non dupliacetes also
			{//if we give j = i+1 then it will check only once from next index so it doesnt give correct output so it prints only once
				
				if(str[i].equals(str[j]) && i>j)
					break;
				if(str[i].equals(str[j]))
					count++;
				
			}
			//if(count > 0)
			//if(count == 1)
			if(count > 1)
				duplicatesCount ++;
				//System.out.println(str[i] + " present " + count + " times ");
			
		}
		System.out.println(duplicatesCount);

	}

}
