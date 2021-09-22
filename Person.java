// Lab03.
// Ashan Roche, Student #: 041019507, 21S_CST8132_300 Section 300 Theory / 301 Lab.

// Creating abstract class. Abstract class cannot be used to create objects. To access it, another class must inherit the abstract class.

public abstract class Person {
	
	// instance variables. Default visibility since another class will be inheriting abstract class.
	String firstName;
    String lastName;
    String emailId;
    long phoneNumber;
    
    // 2 abstract methods. Can only be used in the abstract class.
    abstract public void readInfo();
    abstract public void printInfo();
	
}
