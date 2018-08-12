/**
 * 
 */
package com.sd.java_tutorial.dp.structural.decorator;

/** This serves as abstract decorator for Cars is then extended to wrap a new functionality to Car object.
 * @author Sapan.Desai
 *
 */
public abstract class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	public void getCarSpecification() {
		this.car.getCarSpecification();
		
	}
	

}
