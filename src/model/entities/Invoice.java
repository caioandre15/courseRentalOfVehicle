package model.entities;

public class Invoice {
	// Attributes
	private Double basicPayment;
	private Double tax;
	
	// Builders
	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	// Accessor Methods
	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	// Methods
	public Double totalPayment() {
		return getBasicPayment() + getTax();
	}
}
