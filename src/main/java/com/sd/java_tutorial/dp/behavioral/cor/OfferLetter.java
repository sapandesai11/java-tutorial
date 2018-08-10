/**
 * 
 */
package com.sd.java_tutorial.dp.behavioral.cor;

/** This class is used to store details related to offer released to candidate.
 * @author Sapan.Desai
 *
 */
public class OfferLetter {
	public static final String COMPANY_NAME = "Advanced Business & Healthcare Solutions Pvt. Ltd.";
	private String candidateName;
	private Designations designation;
	
	public OfferLetter(String candidateName, Designations designation) {
		this.candidateName = candidateName;
		this.designation = designation;
	}
	/**
	 * @return the candidateName
	 */
	public String getCandidateName() {
		return candidateName;
	}
	/**
	 * @param candidateName the candidateName to set
	 */
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	/**
	 * @return the designation
	 */
	public Designations getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(Designations designation) {
		this.designation = designation;
	}
	
}
