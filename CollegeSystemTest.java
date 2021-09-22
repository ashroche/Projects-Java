// Lab03.
// Ashan Roche, Student #: 041019507, 21S_CST8132_300 Section 300 Theory / 301 Lab.

// Driver class for program.

import java.util.Scanner;

public class CollegeSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter name of college: ");
	        String name = input.nextLine();

	        System.out.print("Enter number of students: ");
	        int n = input.nextInt();
	        College c1= new College(name, n);

	        c1.readStudentsDetails();
	        c1.printTitle();
	        c1.printStudentsDetails();
	        

	}

}
