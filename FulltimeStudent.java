// Lab03.
// Ashan Roche, Student #: 041019507, 21S_CST8132_300 Section 300 Theory / 301 Lab.

// FulltimeStudent class inheriting properties of Student class.

import java.util.Scanner;

public class FulltimeStudent extends Student {
	
	// instance variables.
    double tuitionFees;
    
    // defining readInfo() method.
    public void readInfo()
    {
        Scanner input = new Scanner(System.in);
        super.readInfo(); // calling from superclass
        System.out.print("Enter tuition fees: ");
        this.tuitionFees = input.nextDouble();
        
    }
    // defining printInfo() method.
    public void printInfo()
    {
        super.printInfo(); // calling from superclass
        System.out.printf("%12.2f|",this.tuitionFees);
    }
}
