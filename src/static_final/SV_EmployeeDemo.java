package static_final;

public class SV_EmployeeDemo {
	//Program to demonstrate static variables
	public class EmployeeDemo {
	public static void main(String[] args) {
	// Create the first object of the class and pass the two arguments with type
	// string and int.
	//System.out.println(Employee.companyName);
	SV_Employee e = new SV_Employee("Shubh", 123);
	System.out.println(e);
	// Similarly, create the second object of the class and pass the two arguments.
	e = new SV_Employee("Deep", 321);
	System.out.println(e);
	}
}
}