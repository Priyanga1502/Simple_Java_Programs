package inheritance;
//Program to demonstrate Multilevel Inheritance - City Class
public class M_City extends M_State{
	private String cityName;
	private float area;
	public String getCityName() {
	return cityName;
	}
	public void setCityName(String cityName) {
	this.cityName = cityName;
	}
	public float getArea() {
	return area;
	}
	public void setArea(float area) {
	this.area = area;
	}
	@Override
	public String toString() {
	return "M_City [cityName=" + cityName + ", area=" + area + ", StateName=" + getStateName() + ", Language= "+getLanguage()+ ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
	}
}