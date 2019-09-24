package com.aegis;

import java.util.Arrays;

public class MaxDifOfElements {

	public static void main(String[] args) {

		int[] array1= {2, 5, 1, 7, 3, 9, 5};
		int[] array2= {9, 2, 12, 5, 4, 7, 3, 19, 5};
		
		Arrays.sort(array1);
		System.out.println("Sorted Array : " + Arrays.toString(array1));
		int maxElement=array1.length-1;
		System.out.println("Required Pair is :(" + array1[0]+ "," + array1[maxElement]+")");
		
		int difference= array1[maxElement] - array1[0];
		System.out.println("Difference is :"+difference);
		
		Arrays.sort(array2);
		System.out.println("Sorted Array : " + Arrays.toString(array2));
		int maxElement2=array2.length-1;
		System.out.println("Required Pair is :(" + array2[0]+ "," + array2[maxElement2]+")");
		
		int difference2= array2[maxElement] - array2[0];
		System.out.println("Diffrence is :"+difference2);
		
	}

}
