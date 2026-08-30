package com.oops01;

public class OnlineShoppingCart {
	
	private  int cartItems;
	private double totalAmount;
	public void addItem(int count,CartItems c) {
		c.setQuantity(count);
		cartItems=c.getQuantity();
	}
	public void removeItem(int count) {
		cartItems-=count;
	}
	public int getCartItems() {
		return cartItems;
	}
	public double getTotal() {
		return totalAmount;
	}

	public static void main(String[] args) {
		CartItems c1=new CartItems();
		c1.setItemName("Apple");
		c1.setPrice(20);
		c1.setQuantity(3);
		OnlineShoppingCart o1=new OnlineShoppingCart();
		o1.addItem(10,c1);
		System.out.println(o1.getCartItems());
		
	}

}
