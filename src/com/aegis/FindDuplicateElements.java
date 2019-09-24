package com.aegis;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		int[] input= {1, 2, 5, 5, 6, 6, 7, 2};
		
			for(int i=0; i<input.length;i++) {
			for(int j=i+1; j<input.length;j++) {
				if(input[i]==input[j])
					System.out.println(input[j]);
				
			}
			
		}

	}

}
