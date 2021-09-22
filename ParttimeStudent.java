// Lab03.
// Ashan Roche, Student #: 041019507, 21S_CST8132_300 Section 300 Theory / 301 Lab.

// ParttimeStudent class inheriting properties of Student class.

import java.util.Scanner;

public class ParttimeStudent extends Student
{
    // instance variables.
    double courseFeesTotal;
    double credits;
    
    // defining readInfo() method.
    public void readInfo()
    {
        Scanner input = new Scanner(System.in);
        super.readInfo(); // calling from superclass.
        System.out.print("Enter total course fees: ");
        this.courseFeesTotal = input.nextDouble();
        System.out.print("Enter credit hours: ");
        this.credits = input.nextDouble();
        
    }
    // defining printInfo() method.
    public void printInfo()
    {
        super.printInfo(); // calling from superclass.
        System.out.printf("%12.2f|%10.2f|\n", this.courseFeesTotal, this.credits);
    }
}