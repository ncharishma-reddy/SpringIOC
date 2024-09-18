package com.tnsif.myspring;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("Airtel for calling");
		
	}

	@Override
	public void data() {
		System.out.println("Airtel for data");
		
	}
		
}
