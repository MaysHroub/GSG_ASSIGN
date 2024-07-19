package rental_app;

public class Shop  extends Building{

	private String liscenceNumber;
	private int numOfEmployees;
	private String businessType;
	private boolean hasParking;
	
	public Shop(Owner owner, String name, Address address, int numOfFloors, double area) {
		super(owner, name, address, numOfFloors, area);
		liscenceNumber = "NONE";
		numOfEmployees = 0;
		businessType = "UNKNOWN";
		hasParking = false;
	}

	public Shop(Owner owner, String name, Address address, int numOfFloors, double area,
			String liscenceNumber, int numOfEmployees, String businessType, boolean hasParking) {
		super(owner, name, address, numOfFloors, area);
		setLiscenceNumber(liscenceNumber);
		setNumOfEmployees(numOfEmployees);
		setBusinessType(businessType);
		setHasParking(hasParking);
	}

	public String getLiscenceNumber() {
		return liscenceNumber;
	}

	public void setLiscenceNumber(String liscenceNumber) {
		this.liscenceNumber = liscenceNumber;
	}

	public int getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = (numOfEmployees < 0) ? 0 : numOfEmployees;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public boolean isHasParking() {
		return hasParking;
	}

	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}

}
