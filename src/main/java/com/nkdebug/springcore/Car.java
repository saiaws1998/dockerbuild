package com.nkdebug.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Car implements Vehicle{


	@Autowired
	private Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	@Override
	public void ride() {
		System.out.println("driving car"+ " "+ tyre);
		
	}
}
