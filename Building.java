package rental_app;

public abstract class Building {

	private Owner owner;
	private String name;
	private Address address;
	private int numOfFloors;
	private double areaInM2;
	private boolean rented;
	

	public Building(Owner owner, String name, Address address, int numOfFloors, double area) {
		this.owner = owner;
		setName(name);
		setAddress(address);
		setNumOfFloors(numOfFloors);
		setArea(area);
		setRented(false);
	}

	public Owner getOwner() {
		return owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNumOfFloors() {
		return numOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = (numOfFloors <= 0) ? 1 : numOfFloors;
	}

	public double getArea() {
		return areaInM2;
	}

	public void setArea(double area) {
		this.areaInM2 = (area <= 0) ? 100 : area;
	}

	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	@Override
	public String toString() {
		return "Name: " + name + 
				"\nAddress: " + address.toString() + 
				"\nNumner of floors: " + numOfFloors + 
				"\nArea In M^2: " + areaInM2 + 
				"\nIs Rented? " + rented;
	}
	
}
