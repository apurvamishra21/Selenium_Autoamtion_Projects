package com.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicatesPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeDuplicates());

	}
	
	static List<Integer> removeDuplicates()
	{
		
		List<Integer>  a = new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(6);
		a.add(9);
		
		HashSet<Integer> h = new HashSet<Integer>(a);
		
		List<Integer> l = new ArrayList<Integer>(h);
		for(Object ob : l)
		{
			System.out.println(ob);
		}
		
		
		
		return l;
		/*ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        
        System.out.println(numbersList);
 
        List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
         
        //System.out.println(listWithoutDuplicates);
		return listWithoutDuplicates;*/
		
		
		
	}

}
//step 1 : to accept input using scanner
//step 2 : return List<Integer>
/*
String str[] = { "Homer", "Marge", "Bart", "Lisa", "Maggie" };
List<String> lst = Arrays.asList(str);*/

/*
int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
List lst = Arrays.asList(arr);
System.out.println(lst.size());
This will create a list of integers:

List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

int[] ints = {1, 2, 3};
List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}
*
*
*
*
*
*/