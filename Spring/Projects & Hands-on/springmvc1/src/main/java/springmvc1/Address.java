package springmvc1;

public class Address {
	private String street;
	private String country;
	@Override
	public String toString() {
		return "Address [street=" + street + ", country=" + country + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
