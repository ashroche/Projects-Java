// Lab03.
// Ashan Roche, Student #: 041019507, 21S_CST8132_300 Section 300 Theory / 301 Lab.

// ParttimeStudent class inheriting properties of Student class.

import java.util.Scanner;

public class College {

	  // instance variables.
    String name;
    Student[] students; // create an array of Student objects.
    
    // parameterized constructor. Accepts specified arguments - name of the college and the number of students in the college.
    public College(String name, int numOfStudents)
    {
        this.name = name;
        this.students = new Student[numOfStudents];
    }
    // defining method printTitle.
    public void printTitle()
    {
        System.out.println(this.name+" - List of Students");
        System.out.println("***********************************");
        System.out.printf("%12s|%12s|%20s|%20s|%20s|%8s|%12s|%10s|\n","Program","Student#","Name","Email","Phone", "GPA", "Fees","Credits"); // formatting table header.
    }
    // defining method readStudentDetails()
    public void readStudentsDetails()
    {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<this.students.length; i++)
        {
            System.out.println("Enter details of student "+(i+1)+": ");
            System.out.println("==============================");
            System.out.println("1 - Fulltime Student");
            System.out.println("2 - Parttime Student");
            System.out.println("Enter student type: ");
            int type = input.nextInt();
            while(type != 1 && type != 2)
            {
                System.out.println("Invalid input. Please re-enter.");
                System.out.println("1 - Fulltime Student");
                System.out.println("2 - Parttime Student");
                System.out.println("Enter student type: ");
                type = input.nextInt();
            }
            if(type == 1)
            {
                FulltimeStudent s = new FulltimeStudent();
                s.readInfo();
                this.students[i] = s;
            }
            else {
                ParttimeStudent s = new ParttimeStudent();
                s.readInfo();
                this.students[i] = s;
            }
        }
        
    }
    // defining printStudentDetails()
    public void printStudentsDetails()
    {
        for(int i=0; i<students.length; i++)
        {
            students[i].printInfo(); // prints information entered regarding each student.
        }
    }
}
