package Lab2;

import java.util.Arrays;

/**
 * This class initializes and populates array of random integers, performs iterative and recursive binary and linear search
 * Declaration: 		I declare that this is my own original work and is free from plagiarism
 * Student Name: 		Ashan Roche
 * Student Number: 		041 019 507
 * Course: 				CST8130 - Data Structures
 * Program: 			CET-CS-Level 3
 * Professor: 			James Mwangi PhD.
 */

public class BinaryLinearSearch {
		
	/**
	 * instance variables
	 */
	private int[] array = new int[30]; // array of 30 integers
	
	/**
	 * receives an array of integers
	 * 
	 * @param arr - array size
	 * @param number - search location
	 * @return	- element not found
	 */
	public int iterativeBinarySearch(int[] arr, int number) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;

		while (high >= low) { // while loop
			mid = (low + high) / 2;
			if (arr[mid] == number)
				return mid;
			else if (number > arr[mid]) {
				low = mid + 1;
			} else if (number < arr[mid]) {
				high = mid - 1;
			}
		} 
		return -1;
	}

	/**
	 * receives an array of randomly generated integers, the first index and last index of the array, and the number to search
	 * 
	 * @param arr - array size
	 * @param firstIndex - first index of array
	 * @param lastIndex - last index of array
	 * @param number - number to search
	 * @return - element not found
	 */
	public int recursiveBinarySearch(int[] arr, int firstIndex, int lastIndex, int number) {
		if (lastIndex >= firstIndex) {
			int mid = firstIndex + (lastIndex - firstIndex) / 2;

			if (arr[mid] == number)
				return mid;

			if (arr[mid] > number)
				return recursiveBinarySearch(arr, firstIndex, mid - 1, number);

			return recursiveBinarySearch(arr, mid + 1, lastIndex, number);
		}

		return -1;
	}

	/**
	 * generate random integers between 10 and 100
	 * @return - array of random integers
	 */
	public int[] generateRandomInts() {
		System.out.println("Array of randomly generated integers: ");
		int max = 99;
		int min = 11;
		for (int i = 0; i < 30; i++) {
			int random = (int) (Math.random() * (max - min + 1) + min);
			array[i] = random;
		} // for end

		System.out.println("Unsorted array: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));

		return array;
	}

	/**
	 * displays elements remaining each time a half of the array is dropped
	 */
	public void remainingElements() {
		int size = array.length/2;
		while(size>0) {
			for(int i=0; i<size; i++) {
				System.out.print(array[i]+" ");
			}//for loop end 
			System.out.println();
			size = size/2;
		}//while loop end
	}

	/**
	 * receives an array of integers and the search key – number to search
	 * @param arr - array size
	 * @param number - number to search
	 * @return - element not found
	 */
	public int iterativeLinearSearch(int[] arr, int number) {
		for (int index = 0; index < arr.length; index++) {
			if (number == arr[index])
				return index;
		}
		return -1;
	}

	/**
	 * method that receives the array of randomly generated integers, the array size, and the element to search
	 * 
	 * @param arr - array size
	 * @param firstIndex - first index of array
	 * @param lastIndex - last index of array
	 * @param number - number to search
	 * @return - element not found
	 */
	public int recursiveLinearSearch(int[] arr, int firstIndex, int lastIndex, int number) {

		if (lastIndex < firstIndex)
			return -1;

		if (arr[firstIndex] == number)
			return firstIndex;

		if (arr[lastIndex] == number)
			return lastIndex;

		return recursiveLinearSearch(arr, firstIndex + 1, lastIndex - 1, number);
	}

}




