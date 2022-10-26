package com.sorting;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7 , 8 , 9 , 1 ,2};
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr.length-i-1 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}
		public static void printArray(int arr[]) {
			
			for(int i = 0 ; i < arr.length ; i++)
			{
				System.out.println(arr[i]);
			}
			
		}

	}


