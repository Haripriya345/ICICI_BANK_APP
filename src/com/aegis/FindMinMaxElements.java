package com.aegis;

import java.util.Arrays;

public class FindMinMaxElements {

	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 5, 6, 6, 7, 2 };

		Arrays.sort(array);
		System.out.println("Minimum element in given Array=" + array[0]);
		System.out.println("Maximum element in given Array="+ array[array.length-1]);

	}

}
