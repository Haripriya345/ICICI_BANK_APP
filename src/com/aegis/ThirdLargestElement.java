package com.aegis;

public class ThirdLargestElement {

	static void thirdLargest(int arr[], int arr_size) {

		if (arr_size < 3) {
			System.out.printf(" Invalid Input ");
			return;
		}

		// Find first
		// largest element
		int first = arr[0];
		for (int i = 1; i < arr_size; i++)
			if (arr[i] > first)
				first = arr[i];

		// Find second
		// largest element
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > second && arr[i] < first)
				second = arr[i];

		// Find third
		// largest element
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++)
			if (arr[i] > third && arr[i] < second)
				third = arr[i];

		System.out.printf("The third Largest " + "element is %d\n", third);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 8, 1, 9, 2, 1, 10 };
		int n = arr.length;
		thirdLargest(arr, n);

		int arr1[] = { 6, 8, 1, 9, 2, 1, 10, 12 };
		int n1 = arr1.length;
		thirdLargest(arr1, n1);
		
		int arr2[] = { 6 };
		int n2 = arr2.length;
		thirdLargest(arr2, n2);
	}
}
