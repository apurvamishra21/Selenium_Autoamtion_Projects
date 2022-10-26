package com.ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		

		l.add(2);
		l.add(4);
		l.add(4);
		l.add(5);
		l.add(7);
		l.add(7);
		l.add(8);
		System.out.println(l);
		
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
			if(count==1)
				System.out.println(l.get(i));
		}
		
		

}
}
