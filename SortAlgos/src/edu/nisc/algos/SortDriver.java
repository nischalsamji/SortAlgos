package edu.nisc.algos;

import java.util.Random;

public class SortDriver {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] arr = new int[200000];
		int arrSize = arr.length;
		long startTime = System.currentTimeMillis();
		for(int i=0; i< arrSize; i++){
			arr[i] = rand.nextInt(200000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		
	}

}
