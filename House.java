package rental_app;

public class House extends Building {
	
	private int numOfBedrooms, numOfBathrooms;
	private double gardenSizeInM2;
	private boolean hasGarage;
	
	public House(Owner owner, String name, Address address, int numOfFloors, double area) {
		super(owner, name, address, numOfFloors, area);
		numOfBedrooms = 2;
		numOfBathrooms = 1;
		gardenSizeInM2 = 10;
		hasGarage = false;
	}
	
	public House(Owner owner, String name, Address address, int numOfFloors, double area,
			int numOfBedrooms, int numOfBathrooms, double gardenSizeInM2, boolean hasGarage) {
		super(owner, name, address, numOfFloors, area);
		this.numOfBedrooms = numOfBedrooms;
		this.numOfBathrooms = numOfBathrooms;
		this.gardenSizeInM2 = gardenSizeInM2;
		this.hasGarage = hasGarage;
	}

	public int getNumOfBedrooms() {
		return numOfBedrooms;
	}

	public void setNumOfBedrooms(int numOfBedrooms) {
		this.numOfBedrooms = (numOfBedrooms <= 0) ? 1 : numOfBedrooms;
	}

	public int getNumOfBathrooms() {
		return numOfBathrooms;
	}

	public void setNumOfBathrooms(int numOfBathrooms) {
		this.numOfBathrooms = (numOfBathrooms <= 0) ? 1 : numOfBathrooms;
	}

	public double getGardenSizeInM2() {
		return gardenSizeInM2;
	}

	public void setGardenSizeInM2(double gardenSizeInM2) {
		this.gardenSizeInM2 = (gardenSizeInM2 <= 0) ? 10 : gardenSizeInM2;
	}

	public boolean hasGarage() {
		return hasGarage;
	}

}
