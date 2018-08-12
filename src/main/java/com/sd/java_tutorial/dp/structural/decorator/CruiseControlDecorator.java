/**
 * 
 */
package com.sd.java_tutorial.dp.structural.decorator;

import java.util.logging.Logger;

/** This is a concrete implementation of CarDecorator for adding Cruise Control functionality to the given car. 
 * @author Sapan.Desai
 *
 */
public class CruiseControlDecorator extends CarDecorator {
	
	static Logger logger = Logger.getLogger(CruiseControlDecorator.class.getName());

	/**
	 * @param car
	 */
	public CruiseControlDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getCarSpecification() {
		this.car.getCarSpecification();
		addCruiseControl();
		
	}
	
	private void addCruiseControl() {
		logger.info("This car also equiped with Cruise Control.");
	}

}
