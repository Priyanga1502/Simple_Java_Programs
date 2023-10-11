package inheritance;
//Program to demonstrate Multilevel Inheritance - Country Class
public class M_Country {
	
	private String countryName;
	private String capital;
	public String getCountryName() {
	return countryName;
	}
	public void setCountryName(String countryName) {
	this.countryName = countryName;
	}
	public String getCapital() {
	return capital;
	}
	public void setCapital(String capital) {
	this.capital = capital;
	}
	@Override
	public String toString() {
	return "M_Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
}