package com.aegis;

public class SecondLargestSmallest {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 9, 6, 4, 7, 2 };
		int max = arr[0];
		int secondmax = arr[0];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}

		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\nSecond maximum number is: " + secondmax);
		System.out.println("\nSecond minimum number is: " + arr[1]);
	}
}
