package com.aegis;

public class SmallestPairSum {

	static int smallest_pair(int[] a, int n) {
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for (int j = 0; j < n; j++) {

			// If found new minimum
			if (a[j] < min) {

				// Minimum now becomes second minimum
				secondMin = min;

				// Update minimum
				min = a[j];
			}

			// If current element is > min and < secondMin
			else if ((a[j] < secondMin) && a[j] != min)

				// Update secondMin
				secondMin = a[j];
		}

		// Return the sum of the minimum pair
		return (secondMin + min);
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7 };
		int n = arr.length;

		System.out.println(smallest_pair(arr, n));
	}
}
