/**
 * 
 */
package com.sd.java_tutorial.dp.structural.decorator;

import java.util.logging.Logger;

/** This is a concrete implementation of {@link CarDecorator} for adding ABS functionality to the given car. 
 * @author Sapan.Desai
 *
 */
public class ABSCarDecorator extends CarDecorator {
	
	static Logger logger = Logger.getLogger(ABSCarDecorator.class.getName());


	public ABSCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void getCarSpecification() {
		this.car.getCarSpecification();
		addABS();
		
	}
	
	private void addABS() {
		logger.info("This car also equiped with ABS.");
	}

}
