package rental_app;

public class Driver {

	public static void main(String[] args) {
		Customer mays = new Customer("Mays", 20, "0566210035");
		Customer sam = new Customer("Sam", 34, "0569290935");
		
		Owner jalal = new Owner("Jalal", 44, "0596712539", "jalal@gmail.com"),
				ramzi = new Owner("Ramzi", 37, "0566712539", "ramzi@gmail.com");
		
		Building house = new House(jalal, "Cozy Cottage", 
				new Address("123 Main St", "Hebron", "ABC12"),
				1, 500, 2, 2, 20, false);
		Building apartment = new Apartment(jalal, "Sunny Apartment",
				new Address("456 Elm St", "Birzeit", "CKI12"),
				1, 700, 4, 4, 1, true);
		jalal.addBuilding(house);
		jalal.addBuilding(apartment);
		
		Building shop = new Shop(ramzi, "JOYA", 
				new Address("123 Ban St", "Tulkarm", "QRS12"),
				2, 550, "1234567", 4, "Restaurant", true);
		ramzi.addBuilding(shop);
		
		mays.createContract(shop, PaymentMethod.VISA, 10, 2700);
		sam.createContract(apartment, PaymentMethod.CASH, 23, 1560);
		sam.createContract(house, PaymentMethod.MASTER_CARD, 4, 1230);
		mays.createContract(house, PaymentMethod.VISA, 0, 0);
		
		System.out.println("-------------------------");
		System.out.println("All buildings Mays has rented:\n");
		mays.displayAllContracts();
		System.out.println("\nAll buildings Sam has rented:\n");
		sam.displayAllContracts();
		
		System.out.println("-------------------------");
		System.out.println("All buildings owned by Jalal:\n");
		jalal.displayAllBuildings();
		System.out.println("\nAll buildings owned by Ramzi:\n");
		ramzi.displayAllBuildings();
	}

}
