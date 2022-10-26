package InterviewShortQ;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 70, 50, 30, 10, 20, 40, 60 };
		System.out.println(binarySearch(arr, 3, 4, 5));

	}
	public static int binarySearch(int arr[], int low, int high, int key) {
		int mid = (low + high) / 2;

		while (low <= high) {
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (low > high) {
			return -1;
		}
		return -1;
	}

}
/*
14. How to implement Binary Search?
The array elements must be sorted for implementing binary search. The binary search algorithm is based on the following conditions. If the key is less than the middle element, then we now need to search only in the first half of the array. If the key is greater than the middle element, then we need to only search in the second half of the array. And if the key is equal to the middle element in the array, then the search ends. Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.*/