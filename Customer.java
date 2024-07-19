package rental_app;

import java.util.ArrayList;

public class Customer extends Person {
	
	private ArrayList<Contract> contracts;

	public Customer(String name, int age, String phoneNumber) {
		super(name, age, phoneNumber);
		contracts = new ArrayList<>();
	}
	
	public void createContract(Building building, PaymentMethod paymentMethod,
			int rentalPeriodInMonths, double monthlyPriceInDollars) {
		if (building.isRented()) {
			System.out.println("Building " + building.getName() + " is already rented.");
			return;
		}
		Contract contract = new Contract(this, building.getOwner(),
				building, paymentMethod, rentalPeriodInMonths, monthlyPriceInDollars);
		building.setRented(true);
		contracts.add(contract);
		System.out.println(getName() + " has rented " + building.getName() + " owned by " + building.getOwner().getName());
	}
	
	public void displayAllContracts() {
		for (Contract c : contracts) 
			System.out.println(c + "\n---------");
	}

}
