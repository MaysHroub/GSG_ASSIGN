package rental_app;

public class Address {
	
	private String street, city, zipCode;

	public Address(String street, String city, String zipCode) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

	@Override
	public String toString() {
		return "street: " + street + ", city: " + city;
	}
	

}
