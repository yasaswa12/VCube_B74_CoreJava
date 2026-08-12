package com.constructors;

public class Product {
    int pid;
    String pName;
    float price;
    
//    Product(int id,String name,int price){
//    	pid=id;
//    	pName= name;
//    	this.price=price;
//    }
     Product(){
    	 System.out.println("No arg");
     }
	 void main(String[] args) {
    //Product p1=new Product(1,"choco",10);
    //p1.show();
    //show();  
    new Product();
   // System.out.println(pid);
	}
   void show() {
	   System.out.println("Product Details are :" + pid +" "+pName +" "+price+" ");
	   hide();
   }
   void hide() {
	   System.out.println("called from hide");
   }
}
