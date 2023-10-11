package inheritance;
//Program to demonstrate Single Inheritance 
//creating child class
public class S_Student extends citizen {
	
	private int rollNo;
	private String collegeName;
	public S_Student() {
	super();
	}
	public S_Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {
	super(name, aadharNo, address, phno); 
	//accessing parent class constructor
	this.rollNo = rollNo;
	this.collegeName = collegeName;
	}
	public int getRollNo() {
	return rollNo;
	}
	public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
	}
	public String getCollegeName() {
	return collegeName;
	}
	public void setCollegeName(String 
	collegeName) {
	this.collegeName = collegeName;
	}
	@Override
	public String toString() {
	return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno()+ "]";
	}
}
