package Lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Test class/main method - Lab 2
 * Declaration: 		I declare that this is my own original work and is free from plagiarism
 * Student Name: 		Ashan Roche
 * Student Number: 		041 019 507
 * Course: 				CST8130 - Data Structures
 * Program: 			CET-CS-Level 3
 * Professor: 			James Mwangi PhD.
 */


/**
 * main method
 */
public class Lab2BinLinSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] generateRandomInts = new int[30]; // integer array
		BinaryLinearSearch bls = new BinaryLinearSearch(); // BinaryLinearSearch object

		int option = 0;
		while (true) { // while loop
			try { // try-catch block to ensure inputs are valid
				System.out.println("Select your option in the menu below:");
				System.out.println("1. Initialize and populate an array of 30 random integers.");
				System.out.println("2. Perform recursive binary and linear search.");
				System.out.println("3. Perform iterative binary and linear search.");
				System.out.println("4. Exit.");

				option = scan.nextInt();

				if (option == 1) { // initialize and populate an array of 30 random integers
					generateRandomInts = bls.generateRandomInts();

				} else if (option == 2) { // perform a recursive binary and linear search
					System.out.println("Please enter an integer value to search: ");
					int num = scan.nextInt();
					System.out.println(Arrays.toString(generateRandomInts));
					bls.remainingElements();
					long nanoTime1 = System.nanoTime();
					long currentTimeMillis1 = System.currentTimeMillis();
					int result = bls.recursiveBinarySearch(generateRandomInts, 0, generateRandomInts.length - 1, num);
					long currentTimeMillis2 = System.currentTimeMillis();
					long nanoTime2 = System.nanoTime();

					if (result == -1) {
						System.out.println(num + " was not found : recursive Binary Search");
					} else {
						System.out
						.println(num + " was found at index position " + result + " : recursive Binary Search");
					}
					System.out.println("Time taken in nanoseconds: " + (nanoTime2 - nanoTime1));
					System.out.println("Time taken in milliseconds: " + (currentTimeMillis2 - currentTimeMillis1));

					long nanoTime3 = System.nanoTime();
					long currentTimeMillis3 = System.currentTimeMillis();
					int res = bls.recursiveLinearSearch(generateRandomInts, 0, generateRandomInts.length - 1, num);
					long currentTimeMillis4 = System.currentTimeMillis();
					long nanoTime4 = System.nanoTime();

					if (res == -1) {
						System.out.println(num + " was not found : recursive Linear Search");
					} else {
						System.out
						.println(num + " was found at index position " + result + " : recursive Linear Search");
					}
					System.out.println("Time taken in nanoseconds: " + (nanoTime4 - nanoTime3));
					System.out.println("Time taken in milliseconds: " + (currentTimeMillis4 - currentTimeMillis3));

				} else if (option == 3) { // perform iterative binary and linear search
					System.out.println("Please enter an integer value to search: ");
					int num = scan.nextInt();
					System.out.println(Arrays.toString(generateRandomInts));

					bls.remainingElements();

					long nanoTime1 = System.nanoTime();
					long currentTimeMillis1 = System.currentTimeMillis();
					int result = bls.iterativeBinarySearch(generateRandomInts, num);
					long currentTimeMillis2 = System.currentTimeMillis();
					long nanoTime2 = System.nanoTime();

					if (result == -1) {
						System.out.println(num + " was not found : Iterative Binary Search");
					} else {
						System.out
						.println(num + " was found at index position " + result + " : Iterative Binary Search");
					}
					System.out.println("Time taken in nanoseconds: " + (nanoTime2 - nanoTime1));
					System.out.println("Time taken in milliseconds: " + (currentTimeMillis2 - currentTimeMillis1));

					long nanoTime3 = System.nanoTime();
					long currentTimeMillis3 = System.currentTimeMillis();
					int res = bls.iterativeLinearSearch(generateRandomInts, num);
					long currentTimeMillis4 = System.currentTimeMillis();
					long nanoTime4 = System.nanoTime();

					if (res == -1) {
						System.out.println(num + " was not found : Iterative Linear Search");
					} else {
						System.out
						.println(num + " was found at index position " + result + " : Iterative Linear Search");
					}
					System.out.println("Time taken in nanoseconds: " + (nanoTime4 - nanoTime3));
					System.out.println("Time taken in milliseconds: " + (currentTimeMillis4 - currentTimeMillis3));

				}

				else if (option == 4) {
					break;

				} else {
					System.out.println("Invalid input.");
				}
				
			} catch (Exception e) { // catch block for invalid inputs
				System.out.println("Please enter valid input.");
				scan.nextLine();
			}
		}
		scan.close(); // close scanner object
	}

}
