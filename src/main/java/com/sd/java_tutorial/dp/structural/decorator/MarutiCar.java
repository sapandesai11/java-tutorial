/**
 * 
 */
package com.sd.java_tutorial.dp.structural.decorator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Sapan.Desai
 *
 */
public class MarutiCar implements Car {
	
	static Logger logger = Logger.getLogger(MarutiCar.class.getName());
	private String makerName;
	private String type;
	private String emissionStandards;
	
	private static final String MAKER_NAME = "Maruti";
	
	public MarutiCar(String type, String emissionStandards) {
		this.makerName = MAKER_NAME;
		this.type = type;
		this.emissionStandards = emissionStandards;
	}

	/* (non-Javadoc)
	 * @see com.sd.java_tutorial.dp.structural.decorator.Car#getCarSpecification()
	 */
	public void getCarSpecification() {
		logger.log(Level.INFO, "This is a {0} car from {1}. It has {2} engine.", 
				new String[]{this.getType(), MAKER_NAME, this.getEmissionStandards()});

	}

	/**
	 * @return the makerName
	 */
	public String getMakerName() {
		return makerName;
	}

	/**
	 * @param makerName the makerName to set
	 */
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the emissionStandards
	 */
	public String getEmissionStandards() {
		return emissionStandards;
	}

	/**
	 * @param emissionStandards the emissionStandards to set
	 */
	public void setEmissionStandards(String emissionStandards) {
		this.emissionStandards = emissionStandards;
	}

}
