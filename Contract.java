package rental_app;

public class Contract {

	private Customer customer;
	private Owner buildingOwner;
	private Building building;
	private PaymentMethod paymentMethod;
	private int rentalPeriodInMonths;
	private double monthlyPriceInDollars;

	public Contract(Customer customer, Owner buildingOwner, Building building, PaymentMethod paymentMethod,
			int rentalPeriodInMonths, double monthlyPriceInDollars) {
		this.customer = customer;
		this.buildingOwner = buildingOwner;
		this.building = building;
		this.paymentMethod = paymentMethod;
		this.rentalPeriodInMonths = (rentalPeriodInMonths <= 0) ? 1 : rentalPeriodInMonths;
		this.monthlyPriceInDollars = (monthlyPriceInDollars <= 0) ? 100 : monthlyPriceInDollars;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public int getRentalPeriodInMonths() {
		return rentalPeriodInMonths;
	}

	public double getMonthlyPrice() {
		return monthlyPriceInDollars;
	}

	@Override
	public String toString() {
		return "Customer name: " + customer.getName() + ", Building Owner name: " + buildingOwner.getName() + 
				"\nBuilding ame: " + building.getName() + 
				"\nPayment Method: " + paymentMethod + 
				"\nRental Period In Months: " + rentalPeriodInMonths + 
				"\nMonthly Price In Dollars: " + monthlyPriceInDollars;
	}
	
}
