package com.tnsif.myspring;

public class Jio  implements Sim {
	public Jio() {
		System.out.println("const is called");
	}
	@Override
	public void calling() {
		System.out.println("Jio for calling");
		
	}

	@Override
	public void data() {
		System.out.println("Jio for data");
		
	}

}
