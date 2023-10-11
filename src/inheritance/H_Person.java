package inheritance;

public class H_Person {
private String name;
private String city;
public H_Person() {
	System.out.println("Person class default constructro");
	setName("Priya");
	setCity("Pondy");
}
public H_Person(String name,String city) {
	this.setName(name);
	this.setCity(city);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "H_Person [name="+ name + ", city= "+ city +"]";
}
}
