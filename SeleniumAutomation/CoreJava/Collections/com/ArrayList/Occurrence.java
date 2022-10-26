package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		//ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1 , 2 , 3 , 3 , 2 , 2 , 2 , 4 , 5 , 6 ,6 , 7 ,8 ,9));
		ArrayList<String> l  = new ArrayList<String>();
		//LinkedHashSet<Integer> lhm = new LinkedHashSet<Integer>(nums);

		/*l.add(2);
		l.add(4);
		l.add(4);
		l.add(5);
		l.add(7);
		l.add(7);
		l.add(8);*/
		
		l.add("k");
		l.add("q");
		l.add("q");
		l.add("w");
		l.add("r");
		l.add("r");
		l.add("i");
		l.add("j");
		
		
		//System.out.println(l);
		
		for(int i = 0 ; i < l.size() ; i++)
		{
			int count = 0;
			for(int j = 0 ; j < l.size() ; j++)
			{
				if(l.get(i).equals(l.get(j)) && i > j)
				break;
				if(l.get(i).equals(l.get(j)))
						count++;
							
						
			}
			if(count > 0)
				System.out.println(l.get(i) + " present " +  count  + " time ");
		}
		
		



	}

}
