package com.aegis;

import java.util.Arrays;

public class AddOfUniqueElements {

	static int findSum(int arr[], int n) {

		Arrays.sort(arr);

		int sum = arr[0];
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				sum = sum + arr[i + 1];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		int n = arr1.length;
		System.out.println(findSum(arr1, n));

		int arr2[] = { 1, 1, 3, 2, 2, 3 };
		int n1 = arr2.length;
		System.out.println(findSum(arr2, n1));

	}
}
