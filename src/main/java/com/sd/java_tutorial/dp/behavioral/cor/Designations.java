/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor;

/** This is used to store designation and annual package of the employee.
 * @author Sapan.Desai
 *
 */
public enum Designations {
	TEAM_LEAD("Team Lead", 1200000),
	SR_SOFTWARE_DEVELOPER("Sr.Software Developer", 900000),
	SR_SOFTWARE_TESTER("Sr.Software Tester", 900000),
	HPEL("Fresher", 340000),
	SOFTWARE_ENGINEER("Software Engineer", 500000);
	
	private String designationName;
	private double annualPackage;
	
	Designations(String designationName, double amount){
		this.designationName = designationName;
		this.annualPackage = amount;
	}

	/**
	 * @return the designationName
	 */
	public String getDesignationName() {
		return designationName;
	}

	/**
	 * @param designationName the designationName to set
	 */
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	/**
	 * @return the annualPackage
	 */
	public double getAnnualPackage() {
		return annualPackage;
	}

	/**
	 * @param annualPackage the annualPackage to set
	 */
	public void setAnnualPackage(double annualPackage) {
		this.annualPackage = annualPackage;
	}

}
