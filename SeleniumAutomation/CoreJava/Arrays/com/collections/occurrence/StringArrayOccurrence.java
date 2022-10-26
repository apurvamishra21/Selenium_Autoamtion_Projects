package com.collections.occurrence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringArrayOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"swadheenta" , "google" , "SDET" , "SDET"};
		Map<String , Integer> m = new HashMap<String , Integer>();
		
		for(String str : arr) {
			Integer count = m.get(str);
			if(count == null) {
				m.put(str, 1);
			}else {
				m.put(str, ++count);
			}
		}
	 Set<String> keyset = m.keySet();
		for(String str : keyset)
		{
			System.out.println(str + "=" + m.get(str));
		}

	}

}
