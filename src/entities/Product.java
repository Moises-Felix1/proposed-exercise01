package entities;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Product(String name, Double Price, Integer quantity) {
		super();
		this.name = name;
		this.price = Price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double Price) {
		this.price = Price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return price * quantity;
	}
}
