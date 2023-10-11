package inheritance;

public class HierarchicalInDemo {
public static void main(String[] args) {
H_Person p1 = new H_Person();
System.out.println("-----------Person Details----------");
System.out.println(p1);
H_Person p;
p=new H_Person("Sinthu","Puducherry");
if(p instanceof H_Person)
	System.out.println("Person Details"+p);
p = new H_Employee("Priya","Mumbai",101,67000,"sales");
if(p instanceof H_Employee)
	System.out.println("Employee Details"+p);
p = new H_student("Pankaj","Pune","FE",88);
if(p instanceof H_student)
	System.out.println("Student Details"+p);
}
}
