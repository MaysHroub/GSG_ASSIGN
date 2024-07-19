package rental_app;

public class Apartment extends Building {

	private int floorNumber, numOfBedrooms, numOfBathrooms;
	private boolean hasElevatorAccess;

	public Apartment(Owner owner, String name, Address address, int numOfFloors, double area) {
		super(owner, name, address, numOfFloors, area);
		floorNumber = 1;
		numOfBedrooms = 1;
		numOfBathrooms = 1;
		hasElevatorAccess = false;
	}

	
	
	public Apartment(Owner owner, String name, Address address, int numOfFloors, double area,
			int floorNumber, int numOfBedrooms, int numOfBathrooms, boolean hasElevatorAccess) {
		super(owner, name, address, numOfFloors, area);
		setFloorNumber(floorNumber);
		setNumOfBedrooms(numOfBedrooms);
		setNumOfBathrooms(numOfBathrooms);
		setHasElevatorAccess(hasElevatorAccess);
	}



	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = (floorNumber < 0) ? 0 : floorNumber;
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

	public boolean hasElevatorAccess() {
		return hasElevatorAccess;
	}

	public void setHasElevatorAccess(boolean hasElevatorAccess) {
		this.hasElevatorAccess = hasElevatorAccess;
	}

}
