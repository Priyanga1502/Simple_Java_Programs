package inheritance;
//Program to demonstrate Multilevel Inheritance - State Class
public class M_State extends M_Country {
	
		private String stateName;
		private String language;
		public String getStateName() {
		return stateName;
		}
		public void setStateName(String stateName) {
		this.stateName = stateName;
		}
		public String getLanguage() {
		return language;
		}
		public void setLanguage(String language) {
		this.language = language;
		}
		@Override
		public String toString() {
		return "M_State [stateName=" + stateName + ", Language="+language+", CountryName=" + getCountryName()+ ", Capital()=" + getCapital() +"]";
	}
}