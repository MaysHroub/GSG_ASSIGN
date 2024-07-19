package rental_app;

public abstract class Person {
	
	private String name;
	private int age;
	private String phoneNumber;

	
	public Person(String name, int age, String phoneNumber) {
		setName(name);
		setAge(age);
		setPhoneNumber(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) throw new IllegalArgumentException("Invalid age");
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.matches("[0-9]+") || phoneNumber.length() != 10) 
			throw new IllegalArgumentException("Invalid phone number");
		this.phoneNumber = phoneNumber;
	}

}










