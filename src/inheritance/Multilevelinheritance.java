package inheritance;
//Program to demonstrate MultiLevel inheritance
public class Multilevelinheritance {
	
	public static void main(String[] args) {
	M_City city = new M_City();
	city.setCityName("Nashik");
	city.setArea(264.2f);
	city.setStateName("Maharashtra");
	city.setLanguage("Marathi");
	city.setCountryName("India");
	city.setCapital("Delhi");
	System.out.println(city);
	//M_City City = new M_City("Pondy",262,"Murungapakkam","Tamil","India","Delhi");
	//System.out.println(City);
}
}