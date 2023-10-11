package inheritance;

public class H_Employee extends H_Person {
private int empID;
private float salary;
private String dept;
public H_Employee() {
	System.out.println("Employee Class Default Constructor");
}
public H_Employee(int empID,float salary,String dept) {
	this.empID = empID;
	this.salary = salary;
	this.setDept(dept);
}
public H_Employee(String name,String city,int empID,float salary,String dept) {
	super(name,city);
	this.empID = empID;
	this.salary = salary;
	this.setDept(dept);
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "H_Employee [empID= " + empID +",salary=" + salary +", dept= " + dept + ", getName()=" + getName() +", getCity()=" + getCity() + "]";
}
}