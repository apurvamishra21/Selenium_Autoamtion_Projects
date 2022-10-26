package com.sorting;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, -1, -2, 4};

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

	}

}
/*
This question requires a deep understanding of sorting in Java. If you look at the Arrays utility class, there are many overloaded sort() methods to sort primitive as well as to object arrays. If you are sorting a primitive array in the natural order, then it’s very simple. Just use the Arrays.sort() method.
But, if you want to sort an array of Objects, then the object must implement Comparable interface. If you want to specify the sorting criteria, then you can pass the Comparator for the sorting logic. You should read more about them at - Comparable and Comparator in Java.*/