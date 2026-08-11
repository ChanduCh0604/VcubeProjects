package com.corejavaproject;

public class FouthDay {

	static String Company_name = "Bata";
	
	{
		System.out.println("Company Name = "+Company_name);
	}
	int product_id;
	String product_name;
	int product_price ;
	String product_info;
	 
	void display() {
//		FouthDay f = new FouthDay();
		System.out.println(" Product Id : "+product_id);
		System.out.println(" Product Name : "+product_name);
		System.out.println(" Product price : "+product_price);
		System.out.println(" Product Info : "+product_info);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FouthDay fd= new FouthDay();
		
		fd.product_id = 102;
		fd.product_name = "Sneakers";
		fd.product_price = 1000;
		fd.product_info = "This is Usaually used for the Casula wear";
		fd.display();
	}

}
