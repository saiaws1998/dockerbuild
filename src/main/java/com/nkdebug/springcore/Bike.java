package com.nkdebug.springcore;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	

	@Override
	public void ride() {
		System.out.println("riding bike");
		
	}
}
