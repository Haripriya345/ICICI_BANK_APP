package com.aegis;

public class PairsEqualToGivenSum {
	
	static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
 
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                   // System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                	 System.out.println("("+inputArray[i]+","+inputArray[j]+")");
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        findThePairs(new int[] {3, 6, 8, -8, 10, 8}, 16);
		} 
	} 



