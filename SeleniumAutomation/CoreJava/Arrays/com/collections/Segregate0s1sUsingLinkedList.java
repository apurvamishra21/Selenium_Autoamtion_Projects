package com.collections;

import java.util.LinkedList;

public class Segregate0s1sUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1 , 1 ,0 , 0 , 1 , -1 , 0};
		LinkedList ll = new LinkedList();
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == 0)
			{
				ll.addLast(a[i]);
			}else
			{
				ll.addFirst(a[i]);
			}
		}
		System.out.println(ll);

	}

}
