package com.HashMap;

import java.util.HashMap;

public class StringOccurrenceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "swadheenta";
		int duplicatesCount = 0;
		HashMap<Character , Integer> m = new HashMap<Character , Integer>();
		char[] ch = str.toCharArray();
		for(char c : ch )
		{
			if(m.containsKey(c))
			{
				int count = m.get(c);
				m.put(c, ++count);
				duplicatesCount++;
			}else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		System.out.println(duplicatesCount);
	}

}
