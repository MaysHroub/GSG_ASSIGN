package rental_app;

import java.util.ArrayList;

public class Owner extends Person {
	
	private String email;
	private ArrayList<Building> buildings;

	public Owner(String name, int age, String phoneNumber, String email) {
		super(name, age, phoneNumber);
		buildings = new ArrayList<>();
		setEmail(email);
	}
	
	public void addBuilding(Building building) {
		buildings.add(building);
	}
	
	public boolean removeBuilding(Building building) {
		return buildings.remove(building);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Building> getBuildings() {
		return buildings;
	}
	
	public void displayAllBuildings() {
		for (Building b : buildings) 
			System.out.println(b + "\n----------");
	}
	
}
