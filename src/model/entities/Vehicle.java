package model.entities;

public class Vehicle {
	// Attributes
	private String model;

	// Builders
	public Vehicle() {
	}

	public Vehicle(String model) {
		this.model = model;
	}

	// Accessor Methods
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
