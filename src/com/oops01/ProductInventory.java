package com.oops01;

public class ProductInventory {

	private int productId;
	private String productName;
	private int price;
	private int quantity;
	
	
	public ProductInventory(int productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		if(price>0) {
			this.price = price;
		}else {
			this.price=0;
		}
		if(quantity>0) {
			this.quantity = quantity;
		}else {
			this.quantity=0;
		}

	}


	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price>0)
		this.price = price;
		else
			System.err.println("price can not be negative");
	}
	public int getQuantity() {
		return quantity;
	}

	public void addStock(int quantity) {
		if(quantity>0)
		this.quantity += quantity;
		else
			System.err.println("Quantity can not be negative");
	}
	public void removeStock(int quantity) {
		if(quantity>0 && quantity<=this.quantity)
		this.quantity -= quantity;
		else
			System.err.println("Invalid quantity or insufficcient qty");
	}
	public void displayProduct() {
	 System.out.println("PId= "+productId +" PName= "+productName +" Price= "+price+" Quantity= "+quantity);
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		ProductInventory p1=new ProductInventory(1, "Mango", -1, 0);
		
		p1.addStock(3);
		p1.setPrice(10);
		p1.displayProduct();
	}

}
