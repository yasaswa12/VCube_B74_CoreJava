package com.oops01.Abstraction;

public abstract class FoodOrder {
	
	abstract void calculateBill();
	abstract void deliveryCharge() ;
	public static void main(String[] args) {
		System.out.println("Hello from abstract class");
	}
	
}
 class PizzaOrder extends FoodOrder{

	@Override
	void calculateBill() {
		System.out.println("Pizza Price : 300");
		deliveryCharge();
	}

	@Override
	void deliveryCharge() {
		System.out.println("Delivery charges : 20");
		
	}
	
}
 class BurgerOrder extends FoodOrder{
	 @Override
		void calculateBill() {
			System.out.println("Burger Price : 200");
			deliveryCharge();
		}

		@Override
		void deliveryCharge() {
			System.out.println("Delivery charges : 20");
			
		}
 }
 class BiryaniOrder extends FoodOrder{

	 @Override
		void calculateBill() {
			System.out.println("Biryani Price : 100");
				deliveryCharge();
		}

		@Override
		void deliveryCharge() {
			System.out.println("Delivery charges : 20");
			
		}
	 
 }

	
