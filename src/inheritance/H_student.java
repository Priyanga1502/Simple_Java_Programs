package inheritance;

public class H_student extends H_Person  {
private String clas;
private float per;
public H_student() {
	System.out.println("Student class default constructor");
	setClas("PY");
	setPer(80);
}
public String getClas() {
	return clas;
}
public void setClas(String clas) {
	this.clas = clas;
}
public float getPer() {
	return per;
}
public void setPer(float per) {
	this.per = per;
}
public H_student(String name, String city,String clas,float per)
{
//private members can't inherited into child class
	/*
	 * super.name=name; super.city=city;
	 */
	super(name,city);
	this.clas = clas;
	this.per = per;
}
@Override
public String toString() {
	return "H_student [clas= " + clas +", per=" + per +", getName()= " + getName() + ", getCity()=" + getCity() +"]";
}
}
