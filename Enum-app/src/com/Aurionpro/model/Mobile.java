package com.Aurionpro.model;

public enum Mobile implements IMobile {
	ONEPLUS(25000)
	,SAMSUNG(12000)
	,IPHONE(108000)
	,OPPO;
	
	int price=10000;
	
	
	Mobile(int p) {
		price=p;
	}

	Mobile() {
		this.price=price;
	}


	public int getPrice() {
		return price;
	}

	//Enum can Implement the interface but it cannot extend a class
	public static void OS() {
		System.out.println("Operating system of samsung is Android");
	}	

}
