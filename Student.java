// Lab03.
// Ashan Roche, Student #: 041019507, 21S_CST8132_300 Section 300 Theory / 301 Lab.

// Student class inheriting properties of Person class.

import java.util.Scanner;

public class Student extends Person {
	
	 // instance variables. Default visibility - will be used in subclasses.
    int studentNumber;
    String programName;
    double gpa;
    
    // defining readInfo() method.
    public void readInfo()
    {
        Scanner input = new Scanner(System.in); // closing scanner results in closing of system.in - program crashes. 
        System.out.print("Enter program name: ");
        this.programName = input.next();
        System.out.print("Enter student number: ");
        this.studentNumber = input.nextInt();
        System.out.print("Enter first name: ");
        this.firstName = input.next();
        System.out.print("Enter last name: ");
        this.lastName = input.next();
        System.out.print("Enter email id: ");
        this.emailId = input.next();
        System.out.print("Enter phone number: ");
        this.phoneNumber = input.nextLong();
        this.readMarks();
        
    }
    // defining readMarks() method. Sensitive information; method only visible within the class, not visible from any other class.
    private void readMarks()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        int numOfCourses = input.nextInt();
        double[] marks = new double[numOfCourses];
        for(int i=0; i<numOfCourses; i++)
        {
            System.out.print("Enter mark "+(i+1)+": ");
            marks[i] = input.nextDouble();
        }
        this.calculateGpa(marks);
        ;
    }
    // defining calculateGpa() method. Sensitive information; method only visible within the class, not visible from any other class.
    private void calculateGpa(double[] marks)
    {
        double sum = 0, numOfCourses = marks.length;
        for(int i=0; i<marks.length; i++)
        {
            sum += marks[i];
        }

        this.gpa = (sum*4)/(numOfCourses*100);
    }
    // defining printInfo() method, formatting output.
    public void printInfo()
    {
        System.out.printf("%12s|%12d|%20s|%20s|%20d|%8.2f|", this.programName, this.studentNumber, this.firstName +" "+ this.lastName, this.emailId, this.phoneNumber, this.gpa); // 12 space width for string programName, 12 space width of decimal studentNumber, 20 space width for strings firstName + lastName, 20 space width for string emailId, 20 space width for long phoneNumber, 8 space width, 2 dp floating number for gpa.
    }
    
  
    }
